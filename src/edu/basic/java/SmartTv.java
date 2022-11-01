package edu.basic.java;
/**
 * @author C. Henrique
 * @version 1.0
 * @since 31/10/2022 Release 1
 */
public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int vomule = 5;
    /**
     * Método para ligar a TV
     * @return sempre liga a Tv | boolean = true
     */
    public boolean ligar(){

        return ligada = true;
    }
    /**
     * Método para desligar a TV
     * @return sempre desliga a Tv | boolean = false
     */
    public boolean desligar(){
        return ligada = false;
    }
    /**
     * Método para o proximo Canal da TV
     * @return sempre muda o canal para mais 1 | int = ++
     */
    public int proxCanal(){
        return canal++;
    }
    /**
     * Método para o retornar o Canal da TV
     * @return sempre retorna o canal para menos 1 | int = --
     */
    public int voltarCanal(){
        return canal--;
    }
    /**
     * Método para aumentar o volume da TV
     * @return sempre aumenta o volume para mais 1 | int = ++
     */
    public int aumentarVolume(){
        return vomule++;
    }
    /**
     * Método para diminuir o volume da TV
     * @return sempre diminuir o volume para menos 1 | int = --
     */
    public int diminuirVolume() {
        return vomule--;
    }
    /**
     * Método para selecionar o canal da TV
     * @return altera o canal da Tv via props | props.int
     */
    public int mudarCanal(int novoCanal){
        canal = novoCanal;
        return canal;
    }
}