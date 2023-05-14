package ar.edu.unlam.pb1;

public class Nota {
	private float valor;
	
	// Constructores
	public Nota(float valorInicial) {
		valor = valorInicial;
	}
	
	// Metodos
	public float getValor() {
		return valor;
	}
	
	public boolean aprobado() {
		boolean resultado = false;
		if(valor >= 7) {
			resultado = true;
		}
		return resultado;
	}
	
	public void recuperar(float nuevoValor) {
		this.valor = nuevoValor;
	}
}
