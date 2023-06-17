package ar.edu.unlam.pb1.dominio;

import java.util.Scanner;

public class Capicua {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String numeros;

		System.out.println("Ingrese una serie de numeros");
		numeros = scanner.next();

		StringBuilder capicua = new StringBuilder(numeros);
		capicua.reverse();
		String resultado = capicua.toString();
		boolean sonIguales = resultado.equals(numeros);
		
		System.out.println(sonIguales);
		
		scanner.close();
	}

}
