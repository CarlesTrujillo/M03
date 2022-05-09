package UF4A1.CuentaBancaria;

import UF4A1.CuentaBancaria.CuentaBancaria;

/**
 *
 * @author Carles
 */
public class PruebaCuentaBancaria {

    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria();
        CuentaBancaria.incrementaTotalCuentas();
        c1.movimiento(20);
        System.out.println("Total cuentas: " + CuentaBancaria.totalCuentas);
        System.out.println(c1.saldo());
        System.out.println("La cuenta esta en numeros rojos? " + c1.enNumerosRojos());

        CuentaBancaria c2 = new CuentaBancaria();
        CuentaBancaria.incrementaTotalCuentas();
        System.out.println("Total cuentas: " + CuentaBancaria.totalCuentas);

        // Transferencias
        c1.transferencia(20, c2);
        c1.transferencia(100, c2);

        System.out.println("Saldo de C1: " + c1.saldo());
        System.out.println("Saldo de C2: " + c2.saldo());
    }

}
