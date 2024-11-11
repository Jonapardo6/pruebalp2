
public class Main {
    public static void main(String[] args) {
CuentaAhorros Ahorros = new CuentaAhorros(15000, 0.3);
CuentaCorriente Corriente = new CuentaCorriente(5000, 0.3);
        System.out.println("CuentaAhorros");
        Ahorros.Consignar(5000);
        Ahorros.Retirar(2000);
        Ahorros.ExtractoMensual();
        Ahorros.Imprimir();

        System.out.println("CuentaCorriente");
        Corriente.Consignar(5000);
        Corriente.Retirar(2000);
        Corriente.ExtractoMensual();
        Corriente.Imprimir();

        }
    }
