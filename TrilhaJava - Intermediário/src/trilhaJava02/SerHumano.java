package trilhaJava02;

public abstract class SerHumano extends Pessoa {
	
	protected  boolean andar() {
		if (this.getIdade() >= 1) {
			return true;
		} else {
			return false;
		}
	}

	protected  boolean falar() {
		if (this.getIdade() >= 3) {
			return true;
		} else {
			return false;
		}
	}
	
	

	
	public abstract boolean habilitadoTrabalhar(boolean possuiCarteiraDeTrabalho, int idade);

}
