package edu.basic.java;

import java.util.Scanner;

/**
 * <h2>Exercício de Nome e Idade</h2>
 * <p>
 *     <b>Nota :</b> exercício um
 * </p>
 * @author C. Henriqye
 * @version 1.0
 * @since Criada em 03/11/22
 * */
public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        /**<h3>Classe Main</h3>
         * @param scanner - Recebe a classe Scanner
         * @param nome - definir nome
         * @param idade - valor de idade
         * */
        Scanner scanner = new Scanner(System.in);
        String nome = "";
        int idade = 0 ;
        while(true){
            System.out.println("Nome : " + nome);
            nome = scanner.next();
            if (nome.equals("0")) break;
            System.out.println("Idade : " + idade);
            idade = scanner.nextInt();
        }
    }
}
