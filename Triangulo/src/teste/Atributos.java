package teste;

public class Atributos {

	private double ladoUm;
	private double ladoDois;
	private double ladoTres;

	public final double getLadoUm() {
		return ladoUm;
	}

	public final void setLadoUm(double ladoUm) {
		this.ladoUm = ladoUm;
	}

	public final double getLadoDois() {
		return ladoDois;
	}

	public final void setLadoDois(double ladoDois) {
		this.ladoDois = ladoDois;
	}

	public final double getLadoTres() {
		return ladoTres;
	}

	public final void setLadoTres(double ladoTres) {
		this.ladoTres = ladoTres;
	}

	void verificarTipoTriangulo () {
		
		if ((this.ladoUm == this.ladoDois) && (this.ladoDois == this.ladoTres) && (this.ladoUm == this.ladoTres)) {
			System.out.println("O triângulo é unilátero.");
			} else {
				System.out.println("O triângulo não é unilátero.");
			}
			
	}

}
