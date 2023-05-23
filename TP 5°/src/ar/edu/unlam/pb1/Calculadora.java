package ar.edu.unlam.pb1;

public class Calculadora {
	private int base;
	private int exponente;

	private int numero1;
	private int numero2;

	// CONSTRUCTOR
	public Calculadora(int base, int exponente) {
		this.base = base;
		this.exponente = exponente;
	}

	public Calculadora() {
		this.numero1 = 0;
		this.numero2 = 0;
	}

	// METODOS
	public int potencia() {
		int resultado = 1;
		for (int i = 1; i <= exponente; i++) {
			resultado *= base;
		}
		return resultado;
	}

	public int sumatoria(int limite) {
		int resultado = 0;
		for (int i = 1; i < limite; i++) {
			resultado += i;
		}
		return resultado;
	}

	public int sumatoria(int limiteInferior, int limiteSuperior) {
		int resultado = 0;
		for (int i = limiteInferior; i <= limiteSuperior; i++) {
			resultado += i;
		}
		return resultado;
	}

	public int productoria(int limite) {
		int resultado = 1;
		for (int i = 1; i < limite; i++) {
			resultado *= i;
		}
		return resultado;
	}

	public int productoria(int limiteInferior, int limiteSuperior) {
		int resultado = 1;
		for (int i = limiteInferior; i <= limiteSuperior; i++) {
			resultado *= i;
		}
		return resultado;
	}
	
	public String contarDivisores(int numero) {
		int resto = 0;
		String resultado = "";
		
		for (int i=1; i<= numero; i++) {
			resto = numero % i;
			if(resto == 0) {
				resultado += i + " ,";
			}
		}
		return resultado;
	}
}