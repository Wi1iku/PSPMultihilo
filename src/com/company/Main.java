package com.company;



public class Main {
    static Matriz matriz = new Matriz();
    public static void main(String[] args) throws InterruptedException {
        matriz.mostrarmatiz();
        System.out.println("\n\n");
        for (int i = 0; i < matriz.numerouser ; i++) {
            Hilo hilo = new Hilo(i);
            hilo.start();
            hilo.join();
        }


        matriz.mostrarmatiz();
        }



}
