package ar.edu.unlam.pb1.dominio;

import java.util.Scanner;

public class Dia {

	public static void main(String[] args) {
		short numero;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese un numero, y devolvera el dia que corresponda. Teniendo en cuenta el valor 1 es Domingo.");
		numero = teclado.nextShort();
		teclado.close();
		
		numeroDeDia(numero);
	}

	
	private static void numeroDeDia(short numero) {
		switch(numero) {
		case 1:
			System.out.println("El numero 1, corresponde al dia Domingo.");
			break;
		case 2:
			System.out.println("El numero 2, corresponde al dia Lunes.");
			break;
		case 3:
			System.out.println("El numero 3, corresponde al dia Martes.");
			break;
		case 4:
			System.out.println("El numero 4, corresponde al dia Miercoles.");
			break;
		case 5:
			System.out.println("El numero 5, corresponde al dia Jueves.");
			break;
		case 6:
			System.out.println("El numero 6, corresponde al dia Viernes.");
			break;
		case 7:
			System.out.println("El numero 7, corresponde al dia Sabado.");
			break;
		default:
			System.out.println("El numero ingresado, no corresponde a ningun dia.");
			break;
		}
	}

}
