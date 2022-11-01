package edu.basic.java;
import java.util.Locale;
import java.util.Scanner;

/** <h2>Class para exemplo de input</h2>
 * <p>
 * <b>Nota :</b> Class para uso da lib Scanner.
 * </p>
 *
 * @author C. Henrique
 * @version 1.0
 * @since 01/11/2022
 * */
public class basicJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite algo:");
        String palavra = scanner.next();
        System.out.println("Palavra : "+palavra);
    }
}
