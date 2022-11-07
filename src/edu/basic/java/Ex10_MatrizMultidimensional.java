package edu.basic.java;

import java.util.Random;

/**
 * <h1>Matriz Multidimensional</h1>
 * <p>
 *     <b>Nota :</b> estudo com matriz e vetores
 * </p>
 * @author C. Henrique
 * @version 1.0
 * @since Criada em 07/11/22
 */
public class Ex10_MatrizMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] M = new int[4][4];

        for (int i = 0; i < M.length; i++){
            for (int j = 0; j < M[i].length ; j++){
               M[i][j] = random.nextInt(9);
            }
        }
        for (int[] linha:M ) {
            for (int coluna:linha   ) {
                System.out.print(coluna + " ");
            }
        }
    }

}
