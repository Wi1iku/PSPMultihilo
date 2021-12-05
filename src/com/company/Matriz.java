package com.company;

import java.util.Random;
import java.util.Scanner;

public class Matriz {
    int[][] matriz;
    int numerouser;
    public Matriz(){
        Scanner teclao = new Scanner(System.in);
        System.out.println("Introduce un número");
        numerouser= teclao.nextInt();
        matriz = new int[numerouser][numerouser];
        Random random = new Random();
        int numeroaleatorio;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt(9)+1;
            }
        }
    }


    void mostrarmatiz(){
        int[][] matriz =this.matriz;
        int cont=0;
        for (int[] ints : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(ints[j] + " ");
                cont++;
                if (cont == numerouser) {
                    System.out.println();
                    cont = 0;
                }


            }
        }
    }

    public int getValor(int x,int y) {
        return matriz[x][y];
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setValor(int x, int y, int valor) {
        matriz[x][y]=valor;
    }
}
