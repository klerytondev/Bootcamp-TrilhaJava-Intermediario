package trilhaJava02;

public class Mulher extends SerHumano {

	public Mulher() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean habilitadoTrabalhar(boolean possuiCarteiraDeTrabalho, int idade) {
		if (idade >= 18 && possuiCarteiraDeTrabalho == true
				&& andar() == true) {
			return true;
		} else {
			return false;
		}
	}
	
}
