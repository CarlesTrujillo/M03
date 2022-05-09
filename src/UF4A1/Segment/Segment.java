package UF4A1.Segment;

import UF4A1.Punt.Punt;

/**
 *
 * @author Carles
 */
public class Segment {
    
    Punt puntInicial;
    Punt puntFinal;
    
    public void set(Punt a, Punt b) {
        puntInicial = a;
        puntFinal = b;
    }
    public double modul() {
        
        Punt p = puntFinal.resta(puntInicial);
        return p.modul();
    }
}
