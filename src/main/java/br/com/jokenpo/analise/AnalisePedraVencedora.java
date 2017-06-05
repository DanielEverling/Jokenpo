package br.com.jokenpo.analise;

import br.com.jokenpo.jogador.Jogador;

class AnalisePedraVencedora extends AnaliseJogadaImpl {


  public AnalisePedraVencedora(AnaliseJogada proximaAnalise) {
    super(proximaAnalise);
  }
  
  public Jogador vencedor(Jogador jagador1, Jogador jagador2) {
    if (jagador1.isJogadaPedra() && jagador2.isJogadaTesoura()) {
      return jagador1;
    }
    
    if (jagador2.isJogadaPedra() && jagador1.isJogadaTesoura()) {
      return jagador2;
    }
    
    return getProximaAnalise().vencedor(jagador1, jagador2);
  }

}
