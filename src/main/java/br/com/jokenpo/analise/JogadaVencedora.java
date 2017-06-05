package br.com.jokenpo.analise;

import br.com.jokenpo.jogador.Jogador;

public class JogadaVencedora {

  private AnalisePapelVencedor analisePapelVencedor;
  
  public JogadaVencedora() {
    analisePapelVencedor = new AnalisePapelVencedor(new AnalisePedraVencedora(new AnaliseTesouraVencedora(new Empate())));
  }
  
  public Jogador jogadorVencedor(Jogador jagador1, Jogador jagador2) {
    return analisePapelVencedor.vencedor(jagador1, jagador2);
  }
  
}
