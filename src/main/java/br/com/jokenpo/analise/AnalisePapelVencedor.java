package br.com.jokenpo.analise;

import br.com.jokenpo.jogador.Jogador;

class AnalisePapelVencedor extends AnaliseJogadaImpl {

  public AnalisePapelVencedor(AnaliseJogada proximaAnalise) {
    super(proximaAnalise);
  }

  @Override
  protected boolean primeiroJogadorVencendo(Jogador jagador1, Jogador jagador2) {
    return jagador1.isJogadaPapel() && jagador2.isJogadaPedra();
  }

  @Override
  protected boolean segundoJogadorVencendo(Jogador jagador1, Jogador jagador2) {
    return jagador2.isJogadaPapel() && jagador1.isJogadaPedra();
  }

}