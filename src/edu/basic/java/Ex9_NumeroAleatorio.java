package edu.basic.java;

import java.util.Random;

/**
 * <h1>Numero Aleatório</h1>
 * <p>
 *     <b>Nota :</b> gera números aleatórios.
 * </p>
 */

public class Ex9_NumeroAleatorio {
    public static void main(String[] args) {
        /**
         * <h3>Classe Main</h3>
         * @param random - recebe classes Random()
         * @param numerosAleatorios - armazena array de int
         */
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length ; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        System.out.println("Numeros Aleatórios :");
        for (int numeros: numerosAleatorios ) {
            System.out.print(" "+numeros);
        }
    }
}
