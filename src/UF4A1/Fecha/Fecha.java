package UF4A1.Fecha;

/**
 *
 * @author Carles
 */
public class Fecha {
    
    private int dia;
    private int mes;
    private int año;
    
    public void setFecha(int dd, int mm, int aa) {
        dia = dd;
        mes = mm;
        año = aa;
    }
    public boolean esPrimeroDeMes() {
        if(dia == 1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean esAnterior(Fecha otra) {
        if(año < otra.año) {
            return true;
        } else if(año == otra.año) {
            if(mes < otra.mes) {
                return true;
            } else if(mes == otra.mes) {
                return (dia < otra.dia);
            }
        }
        
        return false;
    }
    public boolean esBisiesto() {
        return (año % 4 == 0 ? true : false);
    }
    
    public String getFecha() {
        return toString();
    }
    
    public String toString() {
        return dia + "/" + mes + "/" + año;
    }
}
