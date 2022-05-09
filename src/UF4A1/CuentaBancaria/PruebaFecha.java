package UF4A1.CuentaBancaria;

import UF4A1.Fecha.Fecha;

/**
 *
 * @author Sergi
 */
public class PruebaFecha {

    public static void main(String[] args) {
        Fecha a = new Fecha();
        
        a.setFecha(4,5,2022);
        
        System.out.println("Fecha: " + a);
        System.out.println("Es bisiesto? " + a.esBisiesto());
        
        Fecha b = new Fecha();
        b.setFecha(4, 5, 2020);
        System.out.println("Fecha: " + b);
        System.out.println("Es bisiesto? " + b.esBisiesto());
    }
    
}
