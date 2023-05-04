package ar.edu.unlam.pb1.dominio;

import ar.edu.unlam.pb1.Calculadora;

public class EjemploDeCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora casio = new Calculadora();
		Calculadora delCelular = new Calculadora(5,4);
		
		System.out.println("La suma de 5 + 11 es: " + casio.sumar(5, 11));
		System.out.println("La suma de 2 + 4 es: " + delCelular.sumar());
		
		System.out.println("La resta de 11 - 5 es: " + casio.restar(11, 5)); 
		System.out.println("La resta de 4 - 2 es: " + delCelular.restar()); 
		
		System.out.println("La multiplicacion de 11 * 5 es: " + casio.multiplicar(11, 5)); 
		System.out.println("La multiplicacion de 5 * 4 es: " + delCelular.multiplicar()); 
		
		System.out.println("La division de 11 / 5 es: " + casio.dividir(11, 5)); 
		System.out.println("La division de 2 / 4 es: " + delCelular.dividir()); 
	}
	
	
}
