package com.company;

import static com.company.Main.matriz;

public class Hilo extends Thread{
    int coordenada;
    public Hilo(int coordenada) {
        super();
        this.coordenada=coordenada;
    }

    @Override
    public void run() {
        for (int i = 0; i < matriz.getMatriz().length; i++) {
            matriz.setValor(i,coordenada,(matriz.getValor(i,coordenada)*10));
        }
    }
}
