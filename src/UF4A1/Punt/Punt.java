package UF4A1.Punt;

/**
 *
 * @author Carles
 */
public class Punt {
    
    private double x;
    private double y;
    
    public void set(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double modul() {
        // Al ser solamente elevado a 2 nos podemos ahorrar memoria haciendolo
        // con una multi simple
        double modul = Math.sqrt(x * x + y * y);
        
        // En este caso seria mas util si fuese elevado a un numero mas grande de 2
        // modul = Math.sqrt(Math.pow(x , 2 + Math.pow(y , 2)));
        
        return modul;
    }
    public void imprimir() {
        System.out.println(toString());
    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    public void sumar(Punt p) {
        x = x + p.x;
        y = y + p.y;
        
    }
    public boolean esMajor(Punt p) {
        /*boolean resultat;
        if(this.modul() > p.modul()) {
            resultat = true;
        } else {
            resultat = false;
        } */
        return (this.modul() > p.modul());
    }
    public Punt resta(Punt p) {
        Punt q = new Punt();
        q.set(x - p.x, y - p.y);
        
        return q;
    }
}
