package com.company;

public class MaquinarioPirulito extends Maquinario{
    public Doce fabricar(){
        return new Pirulito();
    }
}
