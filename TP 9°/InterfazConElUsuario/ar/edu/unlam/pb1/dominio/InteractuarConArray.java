package ar.edu.unlam.pb1.dominio;

import java.util.Scanner;

public class InteractuarConArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el tamaño del array");
		int tamanioArray = scanner.nextInt();
		int array[] = new int[tamanioArray];
		
		System.out.println("\t");
		System.out.println("TAMAÑO SETEADO: " + array.length);
		
		System.out.println("\t");
		for(int i=0; i < array.length; i++) {
			int valor = (int) (Math.random()*100);
			// valores entre 0 y 100
			array[i] = valor;
			System.out.println("En el indice:" + i + " es: " + valor);
		}
		
		System.out.println("\t");
		int suma = 0;
		for(int j = 0; j < array.length; j++) {
			suma += array[j];
		}
		// System.out.println("La suma es: " + suma);
		int promedio = suma / array.length;
		System.out.println("El promedio es:" + promedio);
		
		scanner.close();
	}

}
