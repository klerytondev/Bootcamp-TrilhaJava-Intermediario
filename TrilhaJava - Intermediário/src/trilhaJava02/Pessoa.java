package trilhaJava02;

public abstract class Pessoa {
	
	private String nome;
	private int idade;
	private boolean possuiCarteiraDeTrabalho;
	
	public String getMome() {
		return nome;
	}

	public void setMome(String mome) {
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
