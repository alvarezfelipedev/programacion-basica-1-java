package ar.edu.unlam.pb1;

public class Cuenta {
	private String titular;
	private double saldo;
	
	// Constructores
	public Cuenta(String titular){
		this.titular = titular;
	}
	
	public Cuenta(String titular, double saldoInicial){
		this.titular = titular;
		this.saldo = saldoInicial;
	}
	
	// Metodos
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	/* public String toString() {
		return this.titular.toString();
	} */
	
	public void depositar(double cantidad) {
		saldo = cantidad;
	}
	
	public void retirar(double cantidad) {
		if (saldo >= cantidad) {
			saldo -=cantidad;
			System.out.println("Usted retiro " + cantidad);
		} else {
			System.out.println("La cantidad pedida es invalida");
		}
	}
}
