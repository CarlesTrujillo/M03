package UF4A1.Enumeracions;

/**
 *
 * @author Carles
 */
enum Estat {
    DORMINT, ASSEGUT, CAMINANT, CORRENT;
}

class Gos {

    /*
        Dormint = 0
        Assegut = 1
        Caminant = 2
        Corrent = 3
     */
    Estat estat;
}

public class Enumeracions {

    public static void main(String[] args) {
        Gos boby = new Gos();
        boby.estat = Estat.ASSEGUT;
    }
}
