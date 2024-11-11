public class CuentaCorriente extends CuentaBancaria{
    private float Sobregiro;

    public CuentaCorriente(float SalarioInicial, float TasaAnual, float sobregiro) {
        super(SalarioInicial, TasaAnual);
        Sobregiro = 0 ;
    }

    @Override
    public void Retirar(float Cantidad) {
        if(Cantidad <= Saldo) Saldo -= Cantidad;
        else{
        Sobregiro += (Cantidad - Saldo);Saldo = 0;
    }
    NumeroRetiro++;
    }

    @Override
    public void Consignar(float Cantidad) {
        if(Sobregiro > 0) {
            if (Cantidad > Sobregiro){Saldo += (Cantidad - Sobregiro);Sobregiro = 0;
        }
            else Sobregiro -= Cantidad;
        }else super.Consignar(Cantidad);
    }

    @Override
    public void ExtractoMensual() {
        Saldo -= ComisionMensual;
        CalcularInteres();}
    public void Imprimir(){

    super.Imprimir();
        System.out.println("Sobregiro: " + Sobregiro);
    }
}




