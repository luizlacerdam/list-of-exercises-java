package com.trybe.java;

/**
 * Classe.
 **/

public class House {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public House(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double getPeso() {
        return this.peso;
    }

    public double getAltura() {
        return this.altura;
    }
}
