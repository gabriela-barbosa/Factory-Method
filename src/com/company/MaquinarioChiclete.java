package com.company;

public class MaquinarioChiclete extends Maquinario{
    public Doce fabricar(){
        return new Chiclete();
    }
}
