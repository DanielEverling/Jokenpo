# Jokenpo

Projeto para praticar TDD e a implamentacao dos padroes de projeto Chain of Resposability e Template Method

O pattern Chain foi utilizado para verificar qual jogada venceu a partida.
	Seu uso foi na classe AnaliseJogadaImpl, onde a mesma obriga que no construtor da mesma, ela informe qual eh a proxima jogada a ser analisada.
	O uso do chain faz com que a "cadeia" de tomada de decisao seja "dividido", separando assim as responsabilidades de escolha do vencedor.
Jah o pattern template method foi utilizado no metodo vencedor da mesma classe, seu uso faz com que as classes filhas apenas analisem a forma como seu jogador venceu,
o seu uso encapsula a analise da jogada,

Alem dos patterns aa classe Jogador, foi utilizado "Tell, don't ask", para representar a jogada atual de cada jogador, atraves dos metodos 
	isJogadaPedra, isJogadaPapel, isJogadaTesoura
