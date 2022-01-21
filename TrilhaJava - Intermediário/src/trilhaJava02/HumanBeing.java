package trilhaJava02;

public abstract class HumanBeing extends People {
	
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
	
	protected abstract boolean habilitadoTrabalhar(boolean possuiCarteiraDeTrabalho, int idade);

}
