package com.trybe.java;

/**
 * Classe.
 **/

public class SmartHouse {
    public boolean lampadaLigada = false;

    public void ligarLampada() {
        System.out.println("Ligando a lâmpada...");
        lampadaLigada = true;
    }

    public void desligarLampada() {
        System.out.println("Desligando a lâmpada...");
        lampadaLigada = false;
    }

}
