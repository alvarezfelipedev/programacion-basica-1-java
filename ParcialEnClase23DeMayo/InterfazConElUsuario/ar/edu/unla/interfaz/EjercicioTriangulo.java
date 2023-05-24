package ar.edu.unla.interfaz;

import ar.edu.unlam.pb1.Triangulo;
import java.util.Scanner;

public class EjercicioTriangulo {

	public static void main(String[] args) {
		// Triangulo miT = new Triangulo(3, 5, 7);
		// System.out.println(miT.escaleno());

		Scanner teclado = new Scanner(System.in);
		String letraCorrecta = "S";
		boolean continuar = true;
		
		String letra = null;
		 while (continuar) {
			 letra = teclado.next();
			 if(letra == letraCorrecta) {
				 System.out.println("Puede ingresar");
				 continuar = false;
				 break;
			 }
			 System.out.println("Letra incorrecta");
			 System.out.println("Ingrese S para ingresar correctamente");
		 }

		 // EJERCICIO REALIZADO POR EL PROFE A CONTINUACION:
		 // A. Realizar el ejercicio, DESEA CONTINUAR? 'S' o 's'
		 
		 
		teclado.close();
	}

}
