package trilhaJava04Enum;

public class Services {
	
	public static ImcReturn status(double imc) {
		 
		if (imc < 18.5) {
			return ImcReturn.MAGREZA;
		} else if (imc >= 18.5 && imc < 24.9) {
			return ImcReturn.MORMAL;
		} else if (imc >= 24.9 && imc < 30) {
			return ImcReturn.OBESIDADE;
		}
		return ImcReturn.SOBREPESO;
	}

}
