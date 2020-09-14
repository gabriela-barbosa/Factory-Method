package com.company;

public abstract class Maquinario {
    public void produzirBarra(){
        Doce doce = fabricar();
        doce.alegraAVida();
    }

    public abstract Doce fabricar();
}
