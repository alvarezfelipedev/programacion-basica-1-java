package ar.edu.unlam.pb1.dominio;

import ar.edu.unlam.pb1.Nota;

public class PruebaNota {

	public static void main(String[] args) {
		Nota miNota = new Nota(3);
		
		System.out.println("Mi nota es: "+ miNota.getValor());
		System.out.println("Aprobaste? " + miNota.aprobado());
		miNota.recuperar(7);
		System.out.println("Recien recupere, aprobé? " + miNota.aprobado());
		
		
		Nota nota = new Nota(2);
		nota.recuperar(8);
		System.out.println("Aprobé? " + nota.aprobado());
	}

}
