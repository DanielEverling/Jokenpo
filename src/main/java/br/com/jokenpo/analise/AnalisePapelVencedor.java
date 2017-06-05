package br.com.jokenpo.analise;

import br.com.jokenpo.jogador.Jogador;

class AnalisePapelVencedor extends AnaliseJogadaImpl {

  public AnalisePapelVencedor(AnaliseJogada proximaAnalise) {
    super(proximaAnalise);
  }

  public Jogador vencedor(Jogador jagador1, Jogador jagador2) {
    if (jagador1.isJogadaPapel() && jagador2.isJogadaPedra()) {
      return jagador1;
    }

    if (jagador2.isJogadaPapel() && jagador1.isJogadaPedra()) {
      return jagador2;
    }

    return getProximaAnalise().vencedor(jagador1, jagador2);
  }

}
