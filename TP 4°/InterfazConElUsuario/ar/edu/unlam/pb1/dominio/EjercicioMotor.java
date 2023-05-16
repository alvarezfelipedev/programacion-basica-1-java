package ar.edu.unlam.pb1.dominio;

import java.util.Scanner;

import ar.edu.unlam.pb1.Motor;

public class EjercicioMotor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Motor prueba = new Motor();
		int tipoDeBomba = 0;
		
		System.out.println("Ingrese el tipo de bomba");
		tipoDeBomba = teclado.nextInt();
		prueba.setTipoBomba(tipoDeBomba);
		
		System.out.println("El tipo de motor es " + prueba.dimeTipoMotor());
		
		teclado.close();
	}

}
