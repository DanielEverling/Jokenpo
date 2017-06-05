package br.com.jokenpo.jogador;

public class Jogador {

  private String apelido;

  private Jogada jogada;

  public Jogador(String apelido, Jogada jogada) {
    this.apelido = apelido;
    this.jogada = jogada;
  }

  public String getApelido() {
    return apelido;
  }

  public Jogada getJogada() {
    return jogada;
  }

  public void informarNovaJogada(Jogada novaJogada) {
    this.jogada = novaJogada;
  }

  public boolean isJogadaPedra() {
    return Jogada.PEDRA.equals(getJogada());
  }

  public boolean isJogadaPapel() {
    return Jogada.PAPEL.equals(getJogada());
  }
  
  public boolean isJogadaTesoura() {
    return Jogada.TESOURA.equals(getJogada());
  }
  
}
