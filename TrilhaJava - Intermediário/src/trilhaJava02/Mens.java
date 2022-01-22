package trilhaJava02;

public class Mens extends HumanBeing {

	public Mens() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean habilitadoTrabalhar(boolean possuiCarteiraDeTrabalho, int idade) {
		if (idade >= 18 && possuiCarteiraDeTrabalho == true && andar() == true && falar() == true) {
			return true;
		} else {
			return false;
		}
	}

}
