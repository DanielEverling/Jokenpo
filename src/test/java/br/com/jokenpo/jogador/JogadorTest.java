package br.com.jokenpo.jogador;

import org.junit.Assert;
import org.junit.Test;

public class JogadorTest {

  @Test
  public void deveCriarUmJogador() {
    Jogador joao = new Jogador("Joao", Jogada.PEDRA);
    Assert.assertNotNull(joao);
    Assert.assertEquals("Joao", joao.getApelido());
    Assert.assertEquals(Jogada.PEDRA, joao.getJogada());
  }
  
  @Test
  public void deveTrocarJogadaDoJogador() {
    Jogador joao = new Jogador("Joao", Jogada.PEDRA);
    Assert.assertNotNull(joao);
    Assert.assertEquals("Joao", joao.getApelido());
    Assert.assertEquals(Jogada.PEDRA, joao.getJogada());
    
    joao.informarNovaJogada(Jogada.PAPEL);
    Assert.assertEquals(Jogada.PAPEL, joao.getJogada());
  }
  
}
