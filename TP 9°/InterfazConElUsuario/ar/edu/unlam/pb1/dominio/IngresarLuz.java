package ar.edu.unlam.pb1.dominio;

import java.util.Scanner;

public class IngresarLuz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int array[] = new int[5];
		
		System.out.println("Ingrese un valor");
		for (int i = 0; i < array.length; i++) {
			int valor = scanner.nextInt();
			array[i] = valor;
		}
		
		for (int j = 0; j < array.length; j++) {
			System.out.println("Indice:" + j + "\t lo que contiene es:" + array[j] + "\t posicion:" + (j + 1));
		}
		scanner.close();
	}

}
