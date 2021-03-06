package projetoVacinaIaia;

public class PessoasTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Postos p1 []= new Postos[1];
		Vacina v1 = new Vacina();
		
		v1.printVacina();
		
		for(int i=0; i<p1.length ;i++) {
			p1[i]= new Postos(null);
			p1[i].cadastrarPessoa();
			
			p1[i].listaPostos();
			p1[i].escolhaPosto();
		
			p1[i].setStatusVacina();
			p1[i].calendario();
	   }
	}

}
