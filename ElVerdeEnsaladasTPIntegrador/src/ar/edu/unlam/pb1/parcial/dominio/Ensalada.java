package ar.edu.unlam.pb1.parcial.dominio;

import java.util.Arrays;

public class Ensalada {

	private String nombreDeLaEnsalada;
	private Ingrediente ingredientes[];
	
	public Ensalada (String nombre) {
		this.nombreDeLaEnsalada = nombre;
		this.ingredientes = new Ingrediente[10];
	}
	
	public boolean agregarIngrediente(Ingrediente nuevo) {
		/*
		 * Incorpora un nuevo ingrediente a la ensalada
		 */
		boolean sePudoAgregar = false;
		
		for (int i = 0; i < ingredientes.length; i++) {
			if (ingredientes[i] == null) {
				ingredientes[i] = nuevo;
				sePudoAgregar = true;
				return sePudoAgregar;
			}
		}
		
		return sePudoAgregar;
	}
	
	public boolean esAptoCeliaco() {
		/*
		 * Devuelve true si ning�n ingrediente es de origen TACC.
		 */
		for (int i = 0; i < ingredientes.length; i++) {
			if (ingredientes[i].getOrigen() == Origen.TACC) {
				return false;
			}
		}
		return true;
	}
	
	public boolean esAptoVegetariano() {
		/*
		 * Devuelve true si ning�n ingrediente es de origen ANIMAL
		 */
		for (int i = 0; i < ingredientes.length; i++) {
			if (ingredientes[i].getOrigen() == Origen.ANIMAL) {
				return false;
			}
		}
		return true;
	}
	
	public boolean esAptoVegano() {
		/*
		 * Devuelve true si ning�n ingrediente es de origen ANIMAL ni LECHE ni HUEVO
		 */
		for (int i = 0; i < ingredientes.length; i++) {
			if (ingredientes[i].getOrigen() == Origen.ANIMAL || ingredientes[i].getOrigen() == Origen.LECHE || ingredientes[i].getOrigen() == Origen.HUEVO) {
				return false;
			}
		}
		return true;
	}

	public String toString() {
		/*
		 * Devuelve un String con el nombre de la ensalada y el detalle de los ingredientes que la componen
		 */
		
		
		return "Ensalada: " + nombreDeLaEnsalada + ", Ingredientes = " + Arrays.toString(ingredientes);
	}
	
	public Ingrediente[] getIngredientes () {
		return this.ingredientes;
	}
}