public class CuentaAhorros extends CuentaBancaria {
    private boolean CuentaActiva;

    public CuentaAhorros(float SalarioInicial, float TasaAnual, boolean cuentaActiva) {
        super(SalarioInicial, TasaAnual);
        CuentaActiva = Saldo >= 10000;
    }


    @Override
    public void Consignar(float Cantidad) {
        super.Consignar(Cantidad);
        if (CuentaActiva && Cantidad >= 10000) {
            CuentaActiva = true;
        }
        super.Consignar(Cantidad);
    }

    @Override
    public void Retirar(float Cantidad) {
        super.Retirar(Cantidad);
        if (CuentaActiva && Cantidad >= 10000) {
            CuentaActiva = false;
        }else {
            System.out.println("La cuenta no esta activa para retirar");
        }

    }
    @Override
    public void ExtractoMensual() {
        if (NumeroRetiro > 4) {
            ComisionMensual += (NumeroRetiro - 4) * 1000;
        }
        super.ExtractoMensual();
    }

    @Override
    public void Imprimir() {
        super.Imprimir();
        System.out.println("La cuenta esta activa:" +CuentaActiva);
    }
}
