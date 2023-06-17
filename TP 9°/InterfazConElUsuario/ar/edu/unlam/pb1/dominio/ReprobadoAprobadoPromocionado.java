package ar.edu.unlam.pb1.dominio;

import java.util.Scanner;

public class ReprobadoAprobadoPromocionado {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String arrayDeNombres[] = new String[3];
		Float arrayDeNotas[] = new Float[3];

		String nombre;
		Float nota;

		for (int i = 0; i < arrayDeNombres.length; i++) {
			System.out.println("Ingrese el nombre");
			nombre = scanner.next();
			arrayDeNombres[i] = nombre;
			System.out.println("Nombre ingresado:" + nombre);
			System.out.println("Ingrese la nota");
			nota = scanner.nextFloat();
			System.out.println("Nota ingresada:" + nota);
			arrayDeNotas[i] = nota;
		}
		
		for(int j = 0; j < arrayDeNotas.length; j++) {
			if(arrayDeNotas[j] > 7) {
				System.out.println(arrayDeNombres[j] + ": Promocionado");
			} else if(arrayDeNotas[j] > 4)
				System.out.println(arrayDeNombres[j] + ": Aprobado");
			else {
				System.out.println(arrayDeNombres[j] + ": Desaprobado");
			}
		}
		
	}

}
