package trilhaJava02;

public class Mulher extends SerHumano {

	public Mulher() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean habilitadoTrabalhar(boolean possuiCarteiraDeTrabalho, int idade) {
		if (idade >= this.getIdade() && possuiCarteiraDeTrabalho == this.getPossuiCarteiraDeTrabalho()
				&& andar() == true) {
			return true;
		} else {
			return false;
		}
	}
}
