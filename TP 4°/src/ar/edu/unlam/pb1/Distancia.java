package ar.edu.unlam.pb1;

public class Distancia {
	
	private double valor;
	
	// Metodos
	public double getValor(){
		return this.valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double convertir(UnidadesDeDistancia unidad) {
		double resultado = 0.0;
		switch(unidad) {
		case METRO:
			resultado = this.valor;
			break;
		case DECAMETRO:
			this.valor = valor * 0.1;
			break;
		case HECTOMETRO:
			this.valor = valor * 0.01;
			break;
		case KILOMETRO:
			this.valor = valor * 0.001;
		}
		return resultado;
	}
}
