package UF2A1;

import java.util.Scanner;

/**
 * @version 1.0
 * @author Carles
 */
public class Ex09 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int[][] sudoku = new int[9][9];
        
        System.out.print("Cuantos sudokus quieres comprobar? ");
        int cantidadSudokus = in.nextInt();
        
        System.out.println("Sudoku:");
        for(int i = 0; i < sudoku.length; i++) {
            for(int j = 0; j < sudoku.length; j++) {
                sudoku[i][j] = in.nextInt();
            }
        }
    }
    
}
