package com.trybe.java;

import java.util.HashMap;

/**
 * Classe.
 **/

public class SmartHouse {

  public boolean lampadaLigada = false;
  private House house;
  public HashMap<String, String> estadosBrasileiros = new HashMap<String, String>();

  /**
   * Construtor da classe SmartHouse.
   */
  public SmartHouse() {
    this.house = null;
    estadosBrasileiros.put("SP", "São Paulo");
    estadosBrasileiros.put("RJ", "Rio de Janeiro");
    estadosBrasileiros.put("MG", "Minas Gerais");
    estadosBrasileiros.put("PE", "Pernambuco");
    estadosBrasileiros.put("SC", "Santa Catarina");
    estadosBrasileiros.put("AM", "Amazonas");
  }

  public House getHouse() {
    return this.house;
  }

  public void setHouse(House house) {
    this.house = house;
  }

  /**
   * Obtém o nome do estado brasileiro correspondente à sigla fornecida.
   *
   * @param sigla a sigla do estado brasileiro.
   * @return o nome do estado correspondente à sigla fornecida.
   */

  public String mostraNomeEstado(String sigla) {
    return estadosBrasileiros.get(sigla);
  }

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

  /**
   * Conecta-se à internet.
   *
   * @return true se a conexão foi bem-sucedida, false caso contrário.
   */

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
