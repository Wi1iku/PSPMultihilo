package com.company;

import java.util.Random;

public class NumeroOculto {
    boolean numeroadivinado=false;
    int numerooculto;
    public NumeroOculto(){
        Random random = new Random();
        numerooculto=random.nextInt(100)+1;
    }

    int propuestaNum(int proestaNum){
        if (numeroadivinado){
            return -1;
        }
        else {
            if (numerooculto==proestaNum){
                numeroadivinado=true;
                return 1;

            }
            else {
                return 0;
            }
        }

    }

    public boolean isNumeroadivinado() {
        return numeroadivinado;
    }

    public void setNumeroadivinado(boolean numeroadivinado) {
        this.numeroadivinado = numeroadivinado;
    }

    public int getNumerooculto() {
        return numerooculto;
    }
}

