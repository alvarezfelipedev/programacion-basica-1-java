package ar.edu.unlam.pb1.dominio;

import ar.edu.unlam.pb1.Temperatura;
import java.util.Scanner;
public class EjemploDeTemperatura {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Temperatura termometro = new Temperatura();
		byte unidad;
		double temperatura;
		
		System.out.println("Ingrese en que unidad desea ingresar la temperatura");
		System.out.println(Temperatura.CELSIUS + " Grados centigrados");
		System.out.println(Temperatura.FARENHEIT + " Grados farenheit");
		System.out.println(Temperatura.KELVIN + " Grados kelvin");
		unidad = teclado.nextByte();
		System.out.println("Ingrese la temperatura:");
		temperatura = teclado.nextDouble();
		termometro.setValor(temperatura,unidad);
		System.out.println("Ingrese en que unidad desea visualizarla");
		unidad = teclado.nextByte();
		System.out.println("La temperatura en la unidad solicitada es: " + termometro.convertir(unidad));
		
		teclado.close();
	}

}
