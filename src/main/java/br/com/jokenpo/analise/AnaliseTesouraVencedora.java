package br.com.jokenpo.analise;

import br.com.jokenpo.jogador.Jogador;

class AnaliseTesouraVencedora extends AnaliseJogadaImpl {

  public AnaliseTesouraVencedora(AnaliseJogada proximaAnalise) {
    super(proximaAnalise);
  }

  @Override
  protected boolean primeiroJogadorVencendo(Jogador jagador1, Jogador jagador2) {
    return jagador1.isJogadaTesoura() && jagador2.isJogadaPapel();
  }

  @Override
  protected boolean segundoJogadorVencendo(Jogador jagador1, Jogador jagador2) {
    return jagador2.isJogadaTesoura() && jagador1.isJogadaPapel();
  }

}