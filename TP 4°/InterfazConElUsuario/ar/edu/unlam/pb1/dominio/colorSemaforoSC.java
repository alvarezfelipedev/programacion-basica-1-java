package ar.edu.unlam.pb1.dominio;

import java.util.Scanner;
public class colorSemaforoSC {

	public static void main(String[] args) {
		char letra;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese un color de semaforo: \n Verde \n Amarillo \n Rojo");
		letra = teclado.next().toUpperCase().charAt(0);
		teclado.close();
		
		extracted(letra);
	}

	// Opcion de tipo METODO
	private static void extracted(char letra) {
		switch(letra) {
		case 'V':
			System.out.println("El color del semaforo esta en verde, avance!");
			break;
		case 'A':
			System.out.println("El color del semaforo esta en amarillo, tenga precaucion");
			break;
		case 'R': 
			System.out.println("El color del semaforo esta en rojo, no avance");
			break;
		default:
			System.out.println("Opcion invalida!");
			break;
		}
		
		// Otra opcion
		/* switch(letra) {
		case 'V':
			System.out.println("El color del semaforo esta en verde, avance!");
			break;
		case 'A':
			System.out.println("El color del semaforo esta en amarillo, tenga precaucion");
			break;
		case 'R': 
			System.out.println("El color del semaforo esta en rojo, no avance");
			break;
		default:
			System.out.println("Opcion invalida!");
			break;
		}
		*/
	}

}
