package ar.edu.unlam.pb1.dominio;

import ar.edu.unlam.pb1.Cerradura;

public class PruebaCerradura {

	public static void main(String[] args) {
Cerradura miCerradura = new Cerradura(4321, 5);

	miCerradura.abrir(4321);
	System.out.println("Mi puerta es abierta? " + miCerradura.estaAbierta());
	miCerradura.cerrar();
	System.out.println("Ahora mi puerta esta abierta? " + miCerradura.estaAbierta());
	
	// CANTIDAD DE FALLOS	
	System.out.println("Mi cerradura fue bloqueada? " + miCerradura.fueBloqueada());
	}

}
