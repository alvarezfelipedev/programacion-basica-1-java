package ar.edu.unlam.pb1.dominio;

import ar.edu.unlam.pb1.Persona;

public class EjemploDePersona {

	public static void main(String[] args) {
	
		Persona sofia;
		sofia = new Persona("Sofia","Mujer", 38432153, 2.8, 0.50);

		sofia.cumplirAnios();
		sofia.cumplirAnios();
		sofia.cumplirAnios();
		sofia.cumplirAnios();
		sofia.cumplirAnios();
		sofia.cumplirAnios();
		sofia.cumplirAnios();
		sofia.cumplirAnios();
		sofia.cumplirAnios();
		sofia.cumplirAnios();
		sofia.cumplirAnios();
		sofia.cumplirAnios();
		sofia.cumplirAnios();
		sofia.cumplirAnios();
		sofia.cumplirAnios();
		sofia.cumplirAnios();
		sofia.cumplirAnios();
		sofia.cumplirAnios();
		
		System.out.println("Sofia es mayor de edad? " + sofia.MayorDeEdad());
		
	}

}
