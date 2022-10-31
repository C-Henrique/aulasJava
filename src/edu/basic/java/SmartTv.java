package edu.basic.java;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int vomule = 5;

    public boolean ligar(){
        return ligada = true;
    }
    public boolean desligar(){
        return ligada = false;
    }
    public int proxCanal(){
        return canal++;
    }
    public int voltarCanal(){
        return canal--;
    }
    public int aumentarVolume(){
        return vomule++;
    }
    public int diminuirVoluem() {
        return vomule--;
    }
    public int mudarCanal(int novoCanal){
        canal = novoCanal;
        return canal;
    }
}