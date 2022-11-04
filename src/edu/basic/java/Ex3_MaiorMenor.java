package edu.basic.java;

import java.util.Scanner;

/**<h1>Numero Maior e Menor</h1>
 * <p>
 *     <b>Nota :</b> validar o maior e menor numero
 * </p>
 * @author C. Henrique
 * @version 1.0
 * @since Criada em 03/11/22
 * */
public class Ex3_MaiorMenor {
    public static void main(String[] args) {
        /**<h3>Classe Main</h3>
         * @param scanner - Recebe classe Scanner
         * @param numero - Recebe valores digitados pelo terminal
         * @param count - Contador
         * @param maior - Armazena o maior valor
         * @param soma - Calcular a media
         */
        int numero = 0;
        int maior = 0;
        int soma = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        do {
        System.out.println("Digite um numero :");
        numero = scanner.nextInt();
        soma = (numero + soma)/5;
        if (numero > maior) maior = numero;
        ++count;
        }while (count < 5);
        System.out.println("Maior : " +maior);
        System.out.println("Media por 5 : " +soma);


    }
}
