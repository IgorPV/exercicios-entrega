package projetoJavaVacina;

import java.util.Scanner;

public class Postos extends Pessoas {

	public String região;
/*	public int Estoque;
	public int Capacidade;
*/	// public Array Posto
	
	//quero criar uma lista contendo todos os argumentos abaixo para imprimir qdo chamar a listagem completa
	//definindo os estoques e capacidades fixos para teste
	public String posto1N;
	public int Estoque1N = 20;
	public int Capacidade1N = 20;
	public String posto2N;
	public int Estoque2N = 20;
	public int Capacidade2N=20;
	public String posto3N; 
	public int Estoque3N = 20;
	public int Capacidade3N=20;
	public String posto1S; 
	public int Estoque1S = 20;
	public int Capacidade1S=20;
	public String posto1L;  
	public int Estoque1L = 20;
	public int Capacidade1L=20;
	public String posto2L;  
	public int Estoque2L = 20;
	public int Capacidade2L=20;
	public String posto3L;  
	public int Estoque3L = 20;
	public int Capacidade3L=20;
	public String posto1O;  
	public int Estoque1O = 20;
	public int Capacidade1O=20;
	//mostrar a relação de postos por região
	//mostrar o estoque disponivel em cada posto<<<<<<<<<<<<<<<<<<<<<<
	//mostrar quantas pessoas o posto pode atender por dia<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	
	public Postos(String regiao) {
		super(regiao);
			
		this.posto1N = "1 - Drive Thru Jaçanã";
		this.posto2N = "2 - Drive Thru Tremembé";
		this.posto3N = "3 - Drive Thru Vila Maria";
		this.posto1S = "4 - Drive Thru Cambuci";
		this.posto1L = "5 - Drive Thru Cidade Tiradentes";
		this.posto2L = "6 - Drive Thru Itaim Paulista";
		this.posto3L = "7 - Drive Thru São Mateus";
		this.posto1O = "8 - Mega Drive Clube Hebraica";
		
	}
	public void listaPostos() {
		System.out.println(posto1N+"%n"+posto2N+"%n"+posto3N+"%n"+posto1S+"%n"+posto1L+"%n"+posto2L+"%n"+posto3L+"%n"+posto1O+"%n");
	}

	public void escolhaPosto() {
		Scanner leia = new Scanner(System.in);
				
		if(super.getZonaCidade() == "ZN") {
			System.out.println("Escolha o posto desejado: \n"+posto1N+"\n"+posto2N+"\n"+posto3N);
			//this.mostraEndereco(leia.nextInt());
			}
		if(super.getZonaCidade() == "ZS") {
			System.out.println("Escolha o posto desejado: \n"+posto1S);			
			//this.mostraEndereco(leia.nextInt());
			}
		if(super.getZonaCidade() == "ZL") {
			System.out.println("Escolha o posto desejado: \n"+posto1L+"\n"+posto2L+"\n"+posto3L);
			//this.mostraEndereco(leia.nextInt());
			}
		if(super.getZonaCidade() == "ZO") {
			System.out.println("Escolha o posto desejado: \n"+posto1O);
			//this.mostraEndereco(leia.nextInt());
			}
	}
/*	
	public void mostraEndereco(int endereco) {
		if (endereco == 1) {
			System.out.println("R: Carlos Dos Santos  S/N");
			this.controleEstoque(1);
			this.capacidade(1);
		}
		if (endereco == 2) {
			System.out.println("R: Dos Passaros Jd Labitary");
			this.controleEstoque(2);
			this.capacidade(2);
		}
		if (endereco == 3) {
			System.out.println("Rua Antonio M.De Camargo Soldado,87");
			this.controleEstoque(3);
			this.capacidade(3);
		}
		if (endereco == 4) {
			System.out.println("Avenida Lacerda Franco, 795");
			this.controleEstoque(4);
			this.capacidade(4);
		}
		if (endereco == 5) {
			System.out.println("Rua Cabocla Da Lua Nova");
			this.controleEstoque(5);
			this.capacidade(5);
		}
		if (endereco == 6) {
			System.out.println("Rua Cabocla Da Lua Nova");
			this.controleEstoque(6);
			this.capacidade(6);
		}
		if (endereco == 7) {
			System.out.println("Rua: Angelo De Candia,1058");
			this.controleEstoque(7);
			this.capacidade(7);
		}
		if (endereco == 8) {
			System.out.println("Rua Ibiapinóplis, 781");
		}		
	}
*/
/*	public void controleEstoque(int posto) {
		 //se a pessoa escolhe o posto tal, é feito um decremento do estoque do posto tal
		if(posto == 1) {
			this.getPosto1N();
			this.setEstoque(Estoque);
			Estoque--;
			System.out.println("Estoque Atual está em : "+Estoque);
			}
		if(posto == 2) {
			this.getPosto2N();
			this.setEstoque(Estoque);
			Estoque--;
			System.out.println("Estoque Atual está em : "+Estoque);
			}
		if(posto == 3) {
			this.getPosto3N();
			this.setEstoque(Estoque);
			Estoque--;
			System.out.println("Estoque Atual está em : "+Estoque);
			}
		if(posto == 4) {
			this.getPosto1S();
			this.setEstoque(Estoque);
			Estoque--;
			System.out.println("Estoque Atual está em : "+Estoque);
			}
		if(posto == 5) {
			this.getPosto1L();
			this.setEstoque(Estoque);
			Estoque--;
			System.out.println("Estoque Atual está em : "+Estoque);
			}
		if(posto == 6) {
			this.getPosto2L();
			this.setEstoque(Estoque);
			Estoque--;
			System.out.println("Estoque Atual está em : "+Estoque);
			}
		if(posto == 7) {
			this.getPosto3L();
			this.setEstoque(Estoque);
			Estoque--;
			System.out.println("Estoque Atual está em : "+Estoque);
			}
		if(posto == 8) {
			this.getPosto1O();
			this.setEstoque(Estoque);
			Estoque--;
			System.out.println("Estoque Atual está em : "+Estoque);
			}
	}
	
	public void capacidade(int posto) {
		//se a pessoa é direcionada para o posto tal, é feito um decremento da capacidade para aquele dia
		if(posto == 1) {
			this.getPosto1N();
			this.setCapacidade(Capacidade);
			Capacidade--;
			System.out.println("Capacidade Atual está em : "+Capacidade);
			}
		if(posto == 2) {
			this.getPosto2N();
			this.setCapacidade(Capacidade);
			Capacidade--;
			System.out.println("Capacidade Atual está em : "+Capacidade);
			}
		if(posto == 3) {
			this.getPosto3N();
			this.setCapacidade(Capacidade);
			Capacidade--;
			System.out.println("Capacidade Atual está em : "+Capacidade);
			}
		if(posto == 4) {
			this.getPosto1S();
			this.setCapacidade(Capacidade);
			Capacidade--;
			System.out.println("Capacidade Atual está em : "+Capacidade);
			}
		if(posto == 5) {
			this.getPosto1L();
			this.setCapacidade(Capacidade);
			Capacidade--;
			System.out.println("Capacidade Atual está em : "+Capacidade);
			}
		if(posto == 6) {
			this.getPosto2L();
			this.setCapacidade(Capacidade);
			Capacidade--;
			System.out.println("Capacidade Atual está em : "+Capacidade);
			}
		if(posto == 7) {
			this.getPosto3L();
			this.setCapacidade(Capacidade);
			Capacidade--;
			System.out.println("Capacidade Atual está em : "+Capacidade);
			}
		if(posto == 8) {
			this.getPosto1O();
			this.setCapacidade(Capacidade);
			Capacidade--;
			System.out.println("Capacidade Atual está em : "+Capacidade);
			}
	}
*/	
	public String getPosto1N() {
		return posto1N;
	}

	public void setPosto1N(String posto1n) {
		posto1N = posto1n;
	}

	public String getPosto2N() {
		return posto2N;
	}

	public void setPosto2N(String posto2n) {
		posto2N = posto2n;
	}

	public String getPosto3N() {
		return posto3N;
	}

	public void setPosto3N(String posto3n) {
		posto3N = posto3n;
	}

	public String getPosto1S() {
		return posto1S;
	}

	public void setPosto1S(String posto1s) {
		posto1S = posto1s;
	}

	public String getPosto1L() {
		return posto1L;
	}

	public void setPosto1L(String posto1l) {
		posto1L = posto1l;
	}

	public String getPosto2L() {
		return posto2L;
	}

	public void setPosto2L(String posto2l) {
		posto2L = posto2l;
	}

	public String getPosto3L() {
		return posto3L;
	}

	public void setPosto3L(String posto3l) {
		posto3L = posto3l;
	}

	public String getPosto1O() {
		return posto1O;
	}

	public void setPosto1O(String posto1o) {
		posto1O = posto1o;
	}

/*	public String getRegião() {
		return Região;
	}

	public void setRegião(String região) {
		Região = região;
	}
/*
	public int getEstoque() {
		return Estoque;
	}

	public void setEstoque(int estoque) {
		Estoque = estoque;
	}

	public int getCapacidade() {
		return Capacidade;
	}

	public void setCapacidade(int capacidade) {
		Capacidade = capacidade;
	}
*/	
}
