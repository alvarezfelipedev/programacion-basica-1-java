package ar.edu.unlam.pb1.dominio;

import ar.edu.unlam.pb1.Alarma;

public class PruebaAlarma {

	public static void main(String[] args) {
		Alarma miCasa = new Alarma(123);
		miCasa.encender(123);
		miCasa.apagar(123);
		miCasa.activada(123);
	}

}
