package com.company;

import java.util.Random;

public class MaquinarioChocolate extends Maquinario{

    @Override
    public void produzirBarra(){
        Doce doce = fabricar();
        premiar();
        doce.alegraAVida();
    }

    private void premiar(){
        Random randomno = new Random();
        boolean premiar = randomno.nextBoolean();
        if (premiar) {
            System.out.println("Essa barra possui um bilhete dourado!!!");
        } else {
            System.out.println("Poooxa, não foi dessa vez que você conseguiu :(");
        }
    }

    public Doce fabricar(){
        return new Chocolate();
    }
}
