package edu.basic.java;

import java.util.Scanner;

/**<h1>Tabuada</h1>
 * <p>
 *     <b>Nota :</b> tabuada de multiplicação
 * </p>
 * @author C. Henrique
 * @version 1.0
 * @since Criação 04/11/22
 */
public class Ex5_Tabuada {
    public static void main(String[] args) {
        /**
         * <h3>Classe Main</h3>
         * @param scanner - Recebe Scanner
         * @param tabuada - Recebe o valor para gerar a tabuada
         * @return Resultado - Uma Tabuada é gerada partir do valor digitado.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tabuada : ");
        int tabuada = scanner.nextInt();
        System.out.printf("--------------------------------%n");
        System.out.printf("Tabuada de %s : %n",tabuada);

        for (int i = 1; i <= tabuada; ++i){
            System.out.printf("%5s X %s = %s  %n",i,tabuada, i*tabuada);
        }
        System.out.printf("--------------------------------%n");
    }
}
