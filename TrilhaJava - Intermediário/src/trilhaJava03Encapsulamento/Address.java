package trilhaJava03Encapsulamento;

public class Address {
	private String tipoLocradouro;
	private String cidade;
	private int numero;
	
	
	public Address(String tipoLocradouro, String cidade, int numero) {
		this.tipoLocradouro = tipoLocradouro;
		this.cidade = cidade;
		this.numero = numero;
	}
	
	public String getTipoLocradouro() {
		return tipoLocradouro;
	}
	public void setTipoLocradouro(String tipoLocradouro) {
		this.tipoLocradouro = tipoLocradouro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Endereco [tipoLocradouro=" + tipoLocradouro + ", cidade=" + cidade + ", numero=" + numero + "]";
	}
	
	

}
