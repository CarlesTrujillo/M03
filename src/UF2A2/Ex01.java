package UF2A2;

/**
 *
 * @author Carles
 */
public class Ex01 {

    public static void main(String[] args) {
        final int ELEMENTS = 10;

        // A[]
        int[] a = crearVector(ELEMENTS, 0, 9);

        // B[]
        int[] b = crearVector(ELEMENTS, 100, 999);

        // C[]
        int[] c = new int[2 * ELEMENTS];
        int j = 0;
        for (int i = 0; i < 2 * ELEMENTS; i++) {

            c[i] = (i % 2 == 0) ? a[i / 2] : b[i / 2];
        }

        // Mostrar resultats A[], B[] i C[]
        System.out.print("A[] = ");
        mostrarVector(a);
        System.out.println();

        System.out.print("B[] = ");
        mostrarVector(b);
        System.out.println();

        System.out.print("C[] = ");
        mostrarVector(c);
        System.out.println();
    }

    static int[] crearVector(int elements, int min, int max) {
        int[] v = new int[elements];
        for (int i = 0; i < elements; i++) {
            v[i] = (int) (Math.random() * (max - min + 1)) + min;
        }

        return v;
    }

    static void mostrarVector(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
            System.out.print("");
        }
    }
}
