package ar.edu.unlam.pb1;

public class Calculadora {
	private double operador1;
	private double operador2;
	
	// Constructores
	
	public Calculadora() {
		this.operador1 = 0.0F;
		this.operador2 = 0.0F;
	}
	
	public Calculadora(double operando1, double operando2) {
		this.operador1 = operando1;
		this.operador2 = operando2;
	}
	
	// Metodos
	public double sumar() {
		double resultado = 0.0F;
		resultado = this.operador1 + this.operador1;
		return resultado;
	}
	
	public double sumar(double operando1, double operando2) {
		double resultado = 0.0F;
		resultado = operando1 + operando2;
		return resultado;
	}
	
	public double restar() {
		double resultado = 0.0F;
		resultado = this.operador1 - this.operador2;
		return resultado;
	}
	
	public double restar(double operando1, double operando2) {
		double resultado = 0.0F;
		resultado = operando1 - operando2;
		return resultado;
	}
	
	public double multiplicar() {
		double resultado = 0.0F;
		resultado = this.operador1 * this.operador2;
		return resultado;
	}
	
	public double multiplicar(double operando1, double operando2) {
		double resultado = 0.0F;
		resultado = operando1 * operando2;
		return resultado;
	}
	
	public double dividir() {
		double resultado = 0.0F;
		resultado = this.operador2 / this.operador1;
		return resultado;
	}
	
	public double dividir(double operando1, double operando2) {
		double resultado = 0.0F;
		resultado = operando1 / operando2;
		return resultado;
	}
}
