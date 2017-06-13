package br.com.jokenpo.analise;

import br.com.jokenpo.jogador.Jogador;

abstract class AnaliseJogadaImpl implements AnaliseJogada {

  private AnaliseJogada proximaAnalise;

  public AnaliseJogadaImpl(AnaliseJogada proximaAnalise) {
    this.proximaAnalise = proximaAnalise;
  }

  protected AnaliseJogada getProximaAnalise() {
    return proximaAnalise;
  }

  public final Jogador vencedor(Jogador jagador1, Jogador jagador2) {

    if (primeiroJogadorVencendo(jagador1, jagador2)) {
      return jagador1;
    }
    
    if (segundoJogadorVencendo(jagador1, jagador2)) {
      return jagador2;
    }

    return getProximaAnalise().vencedor(jagador1, jagador2);
  }

  protected abstract boolean primeiroJogadorVencendo(Jogador jagador1, Jogador jagador2);

  protected abstract boolean segundoJogadorVencendo(Jogador jagador1, Jogador jagador2);

}
