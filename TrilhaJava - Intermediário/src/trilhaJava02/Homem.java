package trilhaJava02;

public class Homem extends SerHumano {

	public Homem() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean habilitadoTrabalhar(boolean possuiCarteiraDeTrabalho, int idade) {
		if (idade >= 18) {
			return true;
		} else {
			return false;
		}

	}

}
