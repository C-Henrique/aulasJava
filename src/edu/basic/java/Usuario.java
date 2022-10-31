package edu.basic.java;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println(smartTv.canal);
        System.out.println(smartTv.ligada);
        System.out.println(smartTv.vomule);
        System.out.println(smartTv.ligar());
        System.out.println(smartTv.aumentarVolume());
        System.out.println(smartTv.mudarCanal(10));
        System.out.println(smartTv.canal);
    }
}

