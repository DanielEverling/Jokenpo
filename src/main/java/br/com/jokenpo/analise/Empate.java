package br.com.jokenpo.analise;

import br.com.jokenpo.jogador.Jogador;

class Empate implements AnaliseJogada {
  
  public Jogador vencedor(Jogador jagador1, Jogador jagador2) {
    throw new EmpateJokenpoException("JOGADA EMPATADA");
  }

}