package projetoJavaVacina;

public class PessoasTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Postos p1 [] = new Postos[2];
		Vacina v1 = new Vacina();
		
		v1.prioridades();
		v1.Infolaboratorio();
		v1.segundaDose();
		
		
		for(int i=0; i<p1.length ;i++) {
			p1[i]= new Postos(null);
		
			p1[i].cadastrarPessoa();
			System.out.println("Pessoa cadastrada com a senha "+p1[i].getSenha());
			
			p1[i].testeIdade();
			
		}
	
		
		
		
	}

}
