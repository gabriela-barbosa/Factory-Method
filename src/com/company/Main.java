package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        System.out.println("Bem-vindos a Fábrica de Chocolate");
        System.out.println("Os nossos chocolates podem vir com um bilhete dourado que dá a chance de você ganhar uma visita a nossa fábrica!!!");
        do {
            System.out.println("\n\n\nTemos amostras grátis!!!\n Escolha 1 para chocolate, 2 para chiclete, 3 para pirulito ou 0 para não quero ser feliz.");
            Scanner in = new Scanner(System.in);
            a = in.nextInt();
            Maquinario maquinario;
            if (a > 0 && a < 4) {
                switch (a) {
                    case 1 -> maquinario = new MaquinarioChocolate();
                    case 2 -> maquinario = new MaquinarioChiclete();
                    case 3 -> maquinario = new MaquinarioPirulito();
                    default -> throw new IllegalStateException("Unexpected value: " + a);
                }
                maquinario.produzirBarra();
            }

        } while (a != 0);

    }
}
