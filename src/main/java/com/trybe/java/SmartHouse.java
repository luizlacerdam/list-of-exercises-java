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

    public boolean isLampadaLigada() {
        return lampadaLigada;
    }

    public boolean conectarInternet() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Tentando conectar à internet...");
            double randomNumber = Math.random();
            if (randomNumber < 0.5) {
                System.out.println("Conectado à internet!");
                return true;
            } else {
                System.out.println("Falha ao conectar à internet!");
            }
        }
        System.out.println("Conectando à internet...");
        return true;
    }
}
