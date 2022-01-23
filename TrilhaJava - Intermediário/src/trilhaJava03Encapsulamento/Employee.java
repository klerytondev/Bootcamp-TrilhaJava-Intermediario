package trilhaJava03Encapsulamento;

public class Employee {
	
	private String nome;
	private String sobreNome;
	private String cpf;
	private int idade;
	private boolean status;
	private Address endereco;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String nome, String sobreNome, String cpf, int idade, boolean status, Address endereco) {
		super();
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.cpf = cpf;
		this.idade = idade;
		this.status = status;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Address getEndereco() {
		return endereco;
	}

	public void addEndereco(Address endereco) {
		this.endereco = endereco;
	}
	
	

	@Override
	public String toString() {
		return  "Empregado [nome=" + nome + ", sobreNome=" + sobreNome + ", cpf=" + cpf + ", idade=" + idade
				+ ", status=" + status + ", endereco=" + endereco + "]";
	}
	
	
	
	
	
		
	
	
	
	
	
	
	

}
