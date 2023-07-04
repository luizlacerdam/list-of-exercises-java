package com.trybe.java;

/**
 * Classe.
 **/

public class House {

  private String nome;
  private int idade;
  private double peso;
  private double altura;

  /**
   * Construtor da classe House.
   *
   * @param nome   O nome da pessoa.
   * @param idade  A idade da pessoa.
   * @param peso   O peso da pessoa.
   * @param altura A altura da pessoa.
   */
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

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }
  /**
   * Calcula o Índice de Massa Corporal (IMC) com base no peso e altura.
   *
   * @return O valor do IMC.
   */

  public double calculaImc() {
    return this.peso / (this.altura * this.altura);
  }
}
