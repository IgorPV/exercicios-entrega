package projetoJavaVacina;

public class PessoasTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoas teste[] = new Pessoas[1];
		Postos p1[] = new Postos[1];
		
		for(int i=0; i<teste.length ;i++) {
			teste[i] = new Pessoas(null,null,null,null,null,null,0);
			teste[i].cadastrarPessoa();
			//teste[i].verificaCad();
			//teste[i].setStatusVacina();
		
			//if () para direcionar a segunda dose caso a reposta do status seja S
			//else e o método de calendário para já definir o período de vacinação, 
			//imprimir caso a idade seja fora do alvo
		}
		for(int i=0; i<p1.length ;i++) {
			//String z = teste[i].getZonaCidade();
			p1[i]=new Postos("ZN");
			p1[i].escolhaPosto();
		}
		
		//system out print para limpar o console
		
		//
		//for() para leitura de dados das pessoas e movimentar o estoque dos postos SE estiver dentro do grupo a vacinar
		/* 
		 *  p1[i] = new Posto(teste[i].getZonaCidade);
		 *  p1[i].Metodo1();
		 *  .
		 *  .
		 *  .
		 *  p1[i].MétodoN;
		 * */
		
		//para pessoa i ---> mostrar nome e senha e perguntar o posto desejado
		
		//mostrar pedido para retornar no dia seguinte caso o estoque tenha terminado
		
		//mensagem de fim do dia	
		
	}

}
