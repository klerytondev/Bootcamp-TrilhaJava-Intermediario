package metaCorrida;

public class Corredor {

	private String nome;
	private int ojetivo = 0;
	private int kmCorridos = 0;
	int dias = 1;

	public Corredor() {

	}

	public Corredor(String mome, int ojetivo, int kmCorridos) {
		this.nome = mome;
		this.ojetivo = ojetivo;
		this.kmCorridos = kmCorridos;
	}

	public String getMome() {
		return nome;
	}

	public void setMome(String mome) {
		this.nome = mome;
	}

	public int getOjetivo() {
		return ojetivo;
	}

	public void setOjetivo(int ojetivo) {
		this.ojetivo = ojetivo;
	}

	public int getKmCorridos() {
		return kmCorridos;
	}

	public void setKmCorridos(int kmCorridos) {
		this.kmCorridos += kmCorridos;
		dias++;
	}
	
	public boolean retorno() {
		if(this.getKmCorridos() >= this.getOjetivo()){
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Parabens! Você atingiu seu objetivo. \nnome do corredor: " + nome + "\nOjetivo=" 
	+ ojetivo + "Km\nTotal acumulado: " + kmCorridos + "Km em " + dias + " dias" ;
	}
}
