package ar.edu.unlam.pb1;

public class contarDivisores {
	public int contarDivisores(int numero) {
		int resto = 0;
		String resultado = "";
		
		for (int i=1; i<= numero; i++) {
			resto = numero % i;
			if(resto == 0) {
				resultado += i + " ";
			}
		}
		return resultado;
	}
}
