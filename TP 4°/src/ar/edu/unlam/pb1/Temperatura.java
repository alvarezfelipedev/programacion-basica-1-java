package ar.edu.unlam.pb1;

public class Temperatura {
	public static final byte CELSIUS = 0;
	public static final byte FARENHEIT = 1;
	public static final byte KELVIN = 2;
	
	private final double UNIDAD_DE_CONVERSION_FARENHEIT = 1.8;
	private final double PUNTO_DE_FUSION_DEL_HIELO = 32;
	private final double UNIDAD_DE_CONVERSION_KELVIN = 273;
	
	private double valor;
	
	// CONSTRUCTORES
	public Temperatura() {
		this.valor = 0.0;
	}
	
	public Temperatura(double valor) {
		this.valor = valor;
	}
	
	// Metodos
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double getValor(){
		return this.valor;
	}
	
	public void setValor(double valor, byte unidad) {
		switch(unidad) {
		case Temperatura.CELSIUS:
			this.valor = valor;
			break;
		case Temperatura.FARENHEIT:
			this.valor = (valor - PUNTO_DE_FUSION_DEL_HIELO) / UNIDAD_DE_CONVERSION_FARENHEIT;;
			break;
		case Temperatura.KELVIN:
			this.valor = valor - UNIDAD_DE_CONVERSION_KELVIN;
			break;
		}
	}
	
	public double convertir(byte unidad){
		double resultado = 0.0;
		switch(unidad) {
		case Temperatura.CELSIUS:
			resultado = this.valor;
			break;
		case Temperatura.FARENHEIT:
			resultado = (this.valor * UNIDAD_DE_CONVERSION_FARENHEIT) + PUNTO_DE_FUSION_DEL_HIELO;
			break;
		case Temperatura.KELVIN:
			resultado = this.valor + UNIDAD_DE_CONVERSION_KELVIN;
			break;
		}
		return resultado;
	}
}
