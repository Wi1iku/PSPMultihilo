package com.company;

import java.util.Random;

import static com.company.Main.numero;

public class HiloAdivinador extends Thread {
    @Override

    public void run() {
        Random random2 = new Random();
        while (!numero.isNumeroadivinado()){
            int numeroadivinador = random2.nextInt(100);
            //System.out.println(numeroadivinador);
            if (numeroadivinador==numero.getNumerooculto()){
                System.out.println("Numero Adivinado");
                numero.setNumeroadivinado(true);
            }
        }
    }
}
