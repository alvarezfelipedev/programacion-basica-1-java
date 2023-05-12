package ar.edu.unlam.pb1.dominio;

import ar.edu.unlam.pb1.Cuenta;

public class PruebaCuenta {

	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta("Lucas", 0);
		miCuenta.depositar(15000);
		
		System.out.println("Deposite " + miCuenta.getSaldo());
		
		miCuenta.retirar(12000);
		System.out.println("Ahora tengo " + miCuenta.getSaldo());
		
		System.out.println("El titular es " + miCuenta.getTitular());
	}

}
