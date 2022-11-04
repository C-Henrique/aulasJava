package edu.basic.java;

import java.util.Scanner;

/**<h1>Nota</h1>
 * <p>
 *     <b>Nota :</b> validação de nota de 1 à 10
 * </p>
 * @author C. Henrique
 * @version 1.0
 * @since Criada em 03/11/22
 * */
public class Ex2_Nota {
    public static void main(String[] args) {
        /**<h3>Classe Main</h3>
         * @param valor - Valor inicial para nota
         * @param scanner - Recebe a classe Scanner
         */
        int valor = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Digite a nota entre 1 a 10 :");
            valor = scanner.nextInt();
            if (valor < 1 | valor > 10) {System.out.println("Valor invalido!"); break;}
        }while (true);
    }
}
