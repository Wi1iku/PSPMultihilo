package com.company;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Hilo> arrayhilo = new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            arrayhilo.add(new Hilo());
        }
        for (int i = 0; i < 5; i++) {
            arrayhilo.get(i).start();
            //arrayhilo.get(i).join();
        }
        for (int i = 0; i < 5; i++) {
            //arrayhilo.get(i).start();
            arrayhilo.get(i).join();
        }

/*        Hilo hilo1 = new Hilo();
        Hilo hilo2 = new Hilo();
        Hilo hilo3 = new Hilo();
        Hilo hilo4 = new Hilo();
        Hilo hilo5 = new Hilo();

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();


        try {
            Thread.currentThread().join();
            System.out.println("terminado");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("error");
        }
        */
        System.out.println(Thread.currentThread().getName());

    }
}
