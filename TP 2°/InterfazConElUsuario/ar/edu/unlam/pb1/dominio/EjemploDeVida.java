package ar.edu.unlam.pb1.dominio;

import ar.edu.unlam.pb1.Persona;

public class EjemploDeVida {

	public static void main(String[] args) {
	
		Persona sofia;
		sofia = new Persona("Sofia","Mujer", 38432153, 2.8, 0.50);
		
		// System.out.println(sofia);
		// se observa: ar.edu.unlam.pb1.Persona@372f7a8d
		
		System.out.println("El peso es: " + sofia.pesar());
		System.out.println("Inicialmente mide: " + sofia.medir());
		
		sofia.alimentar(1.0);
		System.out.println("El peso actual es: " + sofia.pesar());
		sofia.crecer(0.5);
		System.out.println("Mide " + sofia.medir());
		sofia.cumplirAnios();
		System.out.println("Actualmente tiene " + sofia.getEdad() + " anio");
		// Creció y engordó
	}

}
