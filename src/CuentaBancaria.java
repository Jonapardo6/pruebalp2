public class CuentaBancaria {

    protected float SalarioInicial;
    protected int Saldo;
    protected int NumeroConsignaciones;
    protected int NumeroRetiro;
    protected float TasaAnual;
    protected float ComisionMensual;
    protected float ExtractoMensual;


    public CuentaBancaria(float SalarioInicial, float TasaAnual) {
        this.SalarioInicial = SalarioInicial;
        this.TasaAnual = TasaAnual;
        this.NumeroConsignaciones = 0;
        this.NumeroRetiro = 0;
        this.ComisionMensual = ComisionMensual;
        this.ExtractoMensual = ExtractoMensual;
    }

    public void Consignar(float Cantidad) {
        Saldo += Cantidad;
        NumeroConsignaciones++;
    }

    public void Retirar(float Cantidad) {
        if (Cantidad <= Saldo)
            NumeroRetiro++;
    } {
        System.out.println("Saldo Insuficiente");
    }

    public void CalcularInteres() {
        float InteresMensual = Saldo * (TasaAnual / 12);
        Saldo += InteresMensual;
        CalcularInteres();
    }

    public void ExtractoMensual() {
        Saldo -= ComisionMensual;
        CalcularInteres();
    }

    public void Imprimir() {
        System.out.println("Saldo: " + Saldo);
        System.out.println("Numero Consignaciones: " + NumeroConsignaciones);
        System.out.println("Numero Retiro: " + NumeroRetiro);
        System.out.println("Tasa Anual: " + TasaAnual);
        System.out.println("Comision Mensual: " + ComisionMensual);
    }
}



