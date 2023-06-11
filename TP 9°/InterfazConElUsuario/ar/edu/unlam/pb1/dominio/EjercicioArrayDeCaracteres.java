package ar.edu.unlam.pb1.dominio;

import java.util.Scanner;

public class EjercicioArrayDeCaracteres {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		char array[] = new char[26];
		char letra = 'a';

		for (int i = 0; i < array.length; i++) {
			array[i] = letra++;
		}
		System.out.println("Array de letras: " + new String(array));

		// System.out.println(Arrays.toString(array));
		// Los muestra en forma de Array

		StringBuilder cadena = new StringBuilder();

		int posicion;
		do {
			System.out.print("Ingrese un numero (-1 para finalizar): ");
			posicion = scanner.nextInt();

			if (posicion >= 0 && posicion < array.length) {
				char letraAsociada = array[posicion];
				cadena.append(letraAsociada);
				System.out.println("Agrego la letra:" + letraAsociada);
			}
		} while (posicion != -1);

		System.out.println("Cadena generada: " + cadena.toString());

		// CLASE StringBuilder
		/*
		 * StringBuilder sb = new StringBuilder(); sb.append("Hola"); // Agrega "Hola"
		 * al final del StringBuilder sb.append(" mundo"); // Agrega " mundo" al final
		 * del StringBuilder sb.insert(4, " a todos"); // Inserta " a todos" en la
		 * posición 4 del StringBuilder sb.delete(5, 8); // Elimina los caracteres de la
		 * posición 5 a la 7 del StringBuilder sb.replace(0, 4, "Hi"); // Reemplaza los
		 * caracteres del índice 0 al 3 con "Hi" String resultado = sb.toString(); //
		 * Convierte el StringBuilder en un objeto String System.out.println(resultado);
		 * // Imprime "Hi mundo"
		 */

		scanner.close();
	}
}
