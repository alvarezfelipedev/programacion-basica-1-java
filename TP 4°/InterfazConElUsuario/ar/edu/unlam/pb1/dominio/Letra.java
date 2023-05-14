package ar.edu.unlam.pb1.dominio;

import java.util.Scanner;

public class Letra {

	public static void main(String[] args) {
		char letraVocal;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese una letra y devolvera true, si es una vocal");
		letraVocal = teclado.next().toUpperCase().charAt(0);
		teclado.close();
		boolean valor = false;
		
		trueOrFalse(letraVocal, valor);
	}

	
	private static void trueOrFalse(char letraVocal, boolean valor) {
		switch(letraVocal) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			valor = true;
			System.out.println(valor);
			break;
		default:
			System.out.println(valor);
		}
	}

}
