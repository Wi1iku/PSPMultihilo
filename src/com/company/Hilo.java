package com.company;

import java.util.Random;

public class Hilo extends Thread{



    @Override
    public void run() {
        Random rand = new Random();
        int numeroaleatorio=rand.nextInt(4-1)+1;
        numeroaleatorio*=1000;
        try {
            sleep(numeroaleatorio);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hilo "+this.getName()+" ha terminado");

    }

}
