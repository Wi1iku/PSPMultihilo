package com.company;

public class Main {
    static NumeroOculto numero = new NumeroOculto();
    public static void main(String[] args) {
        HiloAdivinador[] hilosarray= new HiloAdivinador[10];
        for (int i = 0; i < 10; i++) {
             hilosarray[i]= new HiloAdivinador();
        }
        for (int i = 0; i <10 ; i++) {
            hilosarray[i].start();
        }
        for (int i = 0; i <10 ; i++) {
            try {
                hilosarray[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
