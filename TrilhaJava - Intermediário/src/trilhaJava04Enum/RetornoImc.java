package trilhaJava04Enum;

public enum RetornoImc {

	MAGREZA, 
	MORMAL, 
	SOBREPESO, 
	OBESIDADE;

	public static RetornoImc status(double imc) {
		if (imc < 18.5) {
			return RetornoImc.MAGREZA;
		} else if (imc >= 18.5 && imc < 24.9) {
			return RetornoImc.MAGREZA;
		} else if (imc >= 24.9 && imc < 30) {
			return RetornoImc.OBESIDADE;
		}
		return RetornoImc.SOBREPESO;
	}

}
