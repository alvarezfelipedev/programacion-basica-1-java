package ar.edu.unlam.pb1.dominio;

import ar.edu.unlam.pb1.ManejoAscensor;
import ar.edu.unlam.pb1.Persona;

public class EjemploDeAscensor {

	public static void main(String[] args) {
		ManejoAscensor consorcioCallePeron = new ManejoAscensor(4,300);
		System.out.println("El piso actual es: " + consorcioCallePeron.getPisoActual());
		consorcioCallePeron.subir();
		consorcioCallePeron.subir();
		consorcioCallePeron.subir();
		System.out.println("El piso actual es: " + consorcioCallePeron.getPisoActual());
		
		Persona lucas = new Persona("Lucas","Masculino", 43321521,60,170);
		Persona maria = new Persona("Maria","Femenino", 43325251,80,165);
		Persona marcos = new Persona("Marcos","Masculino", 43321521,90,180);
		
		consorcioCallePeron.subir();
		
	}

}
