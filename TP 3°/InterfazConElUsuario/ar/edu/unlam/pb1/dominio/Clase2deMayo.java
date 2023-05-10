package ar.edu.unlam.pb1.dominio;

import java.util.Scanner;

import ar.edu.unlam.pb1.Calculadora;

public class Clase2deMayo {

	public static void main(String[] args) {
		int valor = 0;
		String algo;
		Calculadora calcu = new Calculadora();
		Scanner teclado = new Scanner(System.in);
		
		// System.out.println("Ingrese el dato: ");
		// valor = teclado.nextInt();
		// System.out.println("El valor ingresado es: " + valor);
		
		algo = teclado.next();
		System.out.println("El nuevo valor es: " + algo);
		teclado.close();
		
		double valor2;
		double numeroDelUsuario = 0.00F;
		
		System.out.println("Escriba un numero: ");
		valor2 = teclado.nextDouble();
		calcu.esPositivo(valor2);
		System.out.println("El valor ingresado es: " + valor2);
	}

}
