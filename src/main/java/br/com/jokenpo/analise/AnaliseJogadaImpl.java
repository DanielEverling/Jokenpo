package br.com.jokenpo.analise;

abstract class AnaliseJogadaImpl implements AnaliseJogada {

  private AnaliseJogada proximaAnalise;
  
  public AnaliseJogadaImpl(AnaliseJogada proximaAnalise) {
    this.proximaAnalise = proximaAnalise;
  }
  
  protected AnaliseJogada getProximaAnalise() {
    return proximaAnalise;
  }

  
}
