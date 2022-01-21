package trilhaJava02;

public abstract class People {
	
	private String nome;
	private int idade;
	private boolean possuiCarteiraDeTrabalho;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String mome) {
		this.nome = mome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean getPossuiCarteiraDeTrabalho() {
		return possuiCarteiraDeTrabalho;
	}

	public void setPossuiCarteiraDeTrabalho(boolean possuiCarteiraDeTrabalho) {
		this.possuiCarteiraDeTrabalho = possuiCarteiraDeTrabalho;
	}

	protected abstract boolean andar();

	protected abstract boolean falar();

}
