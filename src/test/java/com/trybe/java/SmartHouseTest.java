package com.trybe.java;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SmartHouseTest {

  private SmartHouse casa;
  private House residente;

  @BeforeEach
  public void setUp() {
    casa = new SmartHouse();
    residente = new House("João", 30, 70.0, 1.75);
  }

  @Test
  @DisplayName("1 - Controle da Lâmpada")
  public void testLampada() {
    casa.ligarLampada();
    assertTrue(casa.isLampadaLigada());

    casa.desligarLampada();
    assertFalse(casa.isLampadaLigada());
  }

  @Test
  @DisplayName("2 - Monitoramento do Residente")
  public void testResidente() {
    casa.setHouse(residente);
    assertEquals("João", casa.getHouse().getNome());
    assertEquals(30, casa.getHouse().getIdade());
  }

  @Test
  @DisplayName("3 - Cálculo do IMC")
  public void testImc() {
    casa.setHouse(residente);
    assertEquals(22.86, casa.getHouse().calculaImc(), 0.01);
  }

  @Test
  @DisplayName("4 - Conexão à Internet")
  public void testConexaoInternet() {
    assertTrue(casa.conectarInternet());
  }

  @Test
  @DisplayName("5 - Reconhecimento de Estados")
  public void testEstados() {
    assertEquals("Pernambuco", casa.mostraNomeEstado("PE"));
    assertEquals("Santa Catarina", casa.mostraNomeEstado("SC"));
    assertEquals("Amazonas", casa.mostraNomeEstado("AM"));
  }
}

