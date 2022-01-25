package trilhaJava04Enum;

public enum ImcReturn {

	MAGREZA, 
	MORMAL, 
	SOBREPESO, 
	OBESIDADE;

	public static ImcReturn status(double imc) {
		if (imc < 18.5) {
			return ImcReturn.MAGREZA;
		} else if (imc >= 18.5 && imc < 24.9) {
			return ImcReturn.MAGREZA;
		} else if (imc >= 24.9 && imc < 30) {
			return ImcReturn.OBESIDADE;
		}
		return ImcReturn.SOBREPESO;
	}

}
