package UF4A1.Punt;

import UF4A1.Punt.Punt;

/**
 *
 * @author Carles
 */
public class ProvaPunt {

    public static void main(String[] args) {
        
        Punt a = new Punt();
        a.set(4, 3);
        
        Punt b = new Punt();
        b.set(5, -2);
        
        System.out.print("Punt A: ");
        a.imprimir();
        
        System.out.print("Punt B: ");
        b.imprimir();
        
        //a.sumar(b);
        //System.out.println("Punt A: " + a);
        
        System.out.println("A es mes gran que B? " + a.esMajor(b));
        
        System.out.println("a - b = " + a.resta(b));
    }
    
}
