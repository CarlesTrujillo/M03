package UF4A1.CuentaBancaria;

/**
 *
 * @author Carles
 */
public class CuentaBancaria {

    private double saldo;
    public static int totalCuentas = 0;
    
    private static boolean descubiertos = false;

    public void movimiento(double cantidad) {
        this.saldo += cantidad;
    }

    public static void incrementaTotalCuentas() {
        totalCuentas++;
    }

    public double saldo() {
        return this.saldo;
    }

    public boolean enNumerosRojos() {
        return (saldo < 0);
    }

    public void transferencia(double valor, CuentaBancaria destino) {
        if(this.saldo >= valor || descubiertos) {
            this.saldo -= valor;
            destino.saldo += valor;
        }   
    }
}
