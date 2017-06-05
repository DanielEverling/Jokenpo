package br.com.jokenpo.analise;

import br.com.jokenpo.jogador.Jogador;

class AnaliseTesouraVencedora extends AnaliseJogadaImpl {

  public AnaliseTesouraVencedora(AnaliseJogada proximaAnalise) {
    super(proximaAnalise);
  }

  public Jogador vencedor(Jogador jagador1, Jogador jagador2) {
    if (jagador1.isJogadaTesoura() && jagador2.isJogadaPapel()) {
      return jagador1;
    }

    if (jagador2.isJogadaTesoura() && jagador1.isJogadaPapel()) {
      return jagador2;
    }

    return getProximaAnalise().vencedor(jagador1, jagador2);
  }

}
