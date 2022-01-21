package trilhaJava02;

public abstract class SerHumano extends Pessoa {
	
	public abstract boolean andar(int idade) {
		if (idade >= 1) {
			return true;
		} else {
			return false;
		}
	}

	public abstract boolean falar(int idade) {
		if (idade >= 3) {
			return true;
		} else {
			return false;
		}
	}

	
	public abstract boolean habilitadoTrabalhar(boolean possuiCarteiraDeTrabalho, int idade);

}
