package trilhaJava04Enum;

public class Pascientes {

	private String nome;
	private String sobrenome;
	private int idade;
	private double peso;
	private double altura;
	private RetornoImc status;

	public Pascientes(String nome, String sobrenome, int idade, double peso, double altura) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
		status = RetornoImc.status(this.calculoImc());

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	private double calculoImc() {
		return this.peso / (this.altura * this.altura);
	}

	@Override
	public String toString() {
		return "Pascientes [nome=" + nome + ", sobrenome=" + sobrenome + ", idade=" + idade + ", peso=" + peso
				+ ", altura=" + altura + ", retornoImc=" + status + "]";
	}

}
