package projetoVacinaIaia;

public abstract class Pessoas {
	private String primeiroNome;
	private String meioNome;
	private String ultimoNome;
	String zonaCidade;
	private String dataNasc;
	private String anoNasc;
	private int idade;
	private boolean statusVacina;
	public boolean restrVacina;
	public boolean setStatusVacina;
	public String laboratorio; 
	public int estoqueGeral;
	public String prioridades;
	public int segundaDose;
	

	// construtores para os dados mais relevantes
	public Pessoas(String pNome, String mNome, String uNome, String zCidade, String dNasc, String aNasc, int idade) {

		setPrimeiroNome(pNome);
		setMeioNome(mNome);
		setUltimoNome(uNome);
		setZonaCidade(zCidade);
		setDataNasc(dNasc);
		setAnoNasc(aNasc);
		setIdade(idade);

	}
	
	
	
	//construtor para a classe Postos de Saúde
	public Pessoas(String zonaCidade) {
		
		this.zonaCidade = zonaCidade;
	
	}
	
	public Pessoas() {
		
	}
	

	
	//construtor para a classe Vacina
	public Pessoas(boolean statusVacina, boolean restrVacina) { 
		this.statusVacina = statusVacina;
		this.restrVacina = restrVacina;
	}

	
	
	
	// método para cadastrar a pessoa
	abstract public void cadastrarPessoa();

	

	public void setStatusVacina() { // um método para retornar se a pessoa já se vacinou
		
	}
	
	public boolean getStatusVacina() {
		return this.statusVacina;
	}

	public void setRestrVacina() { //um método para definir se a pessoa tem idade mínima
		if (getIdade() >= 18) {
			this.restrVacina = false;
		} else {
			this.restrVacina = true;
		}
	}
	
	public boolean getRestrVacina() {
		return this.restrVacina;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getMeioNome() {
		return meioNome;
	}

	public void setMeioNome(String meioNome) {
		this.meioNome = meioNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public String getZonaCidade() {
		return zonaCidade;
	}

	public void setZonaCidade(String zonaCidade) {
		this.zonaCidade = zonaCidade;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getAnoNasc() {
		return anoNasc;
	}

	public void setAnoNasc(String anoNasc) {
		this.anoNasc = anoNasc;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}

