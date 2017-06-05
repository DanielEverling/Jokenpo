package br.com.jokenpo.jogador;

import org.junit.Assert;
import org.junit.Test;

import br.com.jokenpo.analise.EmpateJokenpoException;
import br.com.jokenpo.analise.JogadaVencedora;

public class AnaliseJogadaTest {

  @Test
  public void deveValidarJoaoComJogadaPedraComoVencedor() {
    Jogador joao = new Jogador("Joao", Jogada.PEDRA);
    Jogador jose = new Jogador("Jose", Jogada.TESOURA);
    JogadaVencedora analise = new JogadaVencedora();
    Assert.assertEquals(joao, analise.jogadorVencedor(joao, jose));
  }
  
  @Test
  public void deveValidarJoseComJogadaPedraComoVencedor() {
    Jogador joao = new Jogador("Joao", Jogada.TESOURA);
    Jogador jose = new Jogador("Jose", Jogada.PEDRA);
    JogadaVencedora analise = new JogadaVencedora();
    Assert.assertEquals(jose, analise.jogadorVencedor(joao, jose));
  }
  
  @Test
  public void deveValidarJoaoComJogadaPapelComoVencedor() {
    Jogador joao = new Jogador("Joao", Jogada.PAPEL);
    Jogador jose = new Jogador("Jose", Jogada.PEDRA);
    JogadaVencedora analise = new JogadaVencedora();
    Assert.assertEquals(joao, analise.jogadorVencedor(joao, jose));
  }
  
  @Test
  public void deveValidarJoseComJogadaPapelComoVencedor() {
    Jogador joao = new Jogador("Joao", Jogada.PEDRA);
    Jogador jose = new Jogador("Jose", Jogada.PAPEL);
    JogadaVencedora analise = new JogadaVencedora();
    Assert.assertEquals(jose, analise.jogadorVencedor(joao, jose));
  }
  
  @Test
  public void deveValidarJoaoComJogadaTesouraComoVencedor() {
    Jogador joao = new Jogador("Joao", Jogada.TESOURA);
    Jogador jose = new Jogador("Jose", Jogada.PAPEL);
    JogadaVencedora analise = new JogadaVencedora();
    Assert.assertEquals(joao, analise.jogadorVencedor(joao, jose));
  }
  
  @Test
  public void deveValidarJoseComJogadaTesouraComoVencedor() {
    Jogador joao = new Jogador("Joao", Jogada.PAPEL);
    Jogador jose = new Jogador("Jose", Jogada.TESOURA);
    JogadaVencedora analise = new JogadaVencedora();
    Assert.assertEquals(jose, analise.jogadorVencedor(joao, jose));
  }
  

  @Test(expected=EmpateJokenpoException.class)
  public void deveEmpatarPartira() {
    Jogador joao = new Jogador("Joao", Jogada.TESOURA);
    Jogador jose = new Jogador("Jose", Jogada.TESOURA);
    JogadaVencedora analise = new JogadaVencedora();
    analise.jogadorVencedor(joao, jose);
  }
  
}
