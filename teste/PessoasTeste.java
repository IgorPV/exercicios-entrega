package projetoJavaVacina;

public class PessoasTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Postos p1 []= new Postos[2];
		
		for(int i=0; i<p1.length ;i++) {
			p1[i]= new Postos(null);
			p1[i].cadastrarPessoa();
			p1[i].listaPostos();
			p1[i].escolhaPosto();
			//teste[i].verificaCad();
			//teste[i].setStatusVacina();
					
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
