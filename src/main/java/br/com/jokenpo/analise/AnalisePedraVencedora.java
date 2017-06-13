package br.com.jokenpo.analise;

import br.com.jokenpo.jogador.Jogador;

class AnalisePedraVencedora extends AnaliseJogadaImpl {

  public AnalisePedraVencedora(AnaliseJogada proximaAnalise) {
    super(proximaAnalise);
  }
  
  @Override
  protected boolean primeiroJogadorVencendo(Jogador jagador1, Jogador jagador2) {
    return jagador1.isJogadaPedra() && jagador2.isJogadaTesoura();
  }

  @Override
  protected boolean segundoJogadorVencendo(Jogador jagador1, Jogador jagador2) {
    return jagador2.isJogadaPedra() && jagador1.isJogadaTesoura();
  }

}