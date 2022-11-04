package edu.basic.java;

import java.util.Scanner;

/**<h1>Fatorial</h1>
 * <p>
 *     <b>Nota :</b> calculando o fatorial
        * </p>
        * @author C. Henrique
        * @version 1.0
        * @since Criação 04/11/22
  */
public class Ex6_Fatorial {
    public static void main(String[] args) {
        /**
         * <h3>Classe Main</h3>
         * @param scanner - Recebe Scanner
         * @param fatorial - Recebe o valor para calcular
         * @param multiplication - Valor do fatorial
         * @return é gerado um valor do fatorial.
         */
        Scanner scanner = new Scanner(System.in);
        int multiplication = 1;
        System.out.println("Fatorial : ");
        int fatorial = scanner.nextInt();

        for (int i = fatorial; i >= 1; i--){
            multiplication = multiplication * i;
        }
        System.out.printf("%s! = %s",fatorial,multiplication);
    }
}
