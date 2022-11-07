package edu.basic.java;

import java.util.Scanner;

/**
 * <h1>Consoantes</h1>
 * <p>
 *     <b>Nota :</b> em uma lista de letras, volta somente as consoantes.
 * </p>
 * @author C. Henrique
 * @version 1.0
 * @since Criada em 04/11/22
 */
public class Ex8_Consoantes {
    public static void main(String[] args) {
        /**
         * <h3>Classe Main</h3>
         * @param scanner - Recebe Scanner()
         * @param consoantes - Recebe lista das letras
         * @param quantidadeConsoantes - Recebe a quantidade de consoantes para o for()
         * @param count - Recebe o contador
         * @param letra - Recebe letras digitas
         * @return retorna uma lista de consoantes apos 5 letras
         */
        Scanner scanner = new Scanner(System.in);
        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;
        int count = 0;

        do {
            System.out.println("Letra : ");
            String letra = scanner.next();

            if (!(letra.equalsIgnoreCase("a")|
                    letra.equalsIgnoreCase("e")|
                    letra.equalsIgnoreCase("i")|
                    letra.equalsIgnoreCase("o")|
                    letra.equalsIgnoreCase("u"))) {
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }
            count++;
        }while (count <consoantes.length);
        System.out.println("Consoantes :" );
        for (String consoante : consoantes  ) {

            if (consoante != null) System.out.print(" "+consoante);
        }
    }
}
