package edu.basic.java;

/**
 * <h1>Array em ordem reversa</h1>
 * <p>
 *     <b>Nota :</b> Mostra uma lista reversa
 * </p>
 * @author C. Henrique
 * @version 1.0
 * @since Criada em 04/11/22
 */
public class Ex7_Array {
    public static void main(String[] args) {
        /**
         * <h3>Classe Main</h3>
         * @param count - contador;
         * @param vetor - listagem em Array
         *
         */
        int[] vetor = {1,2,3,4,5,6};
        int count = 0;
        System.out.println("Array");
        while (count < (vetor.length)){
            System.out.print(vetor[count]+ " ");
            count++;
        };
        System.out.println("\nReverso");
        for (int i = (vetor.length-1); i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
