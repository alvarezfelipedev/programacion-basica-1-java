package ar.edu.unlam.pb1.eva03;

import java.util.Arrays;

public class ListaDeReproduccion {
	private String nombre;
	private Cancion[] canciones;
	private final int NUMERO_MAXIMO_DE_CANCIONES = 32;

	// Constructor
	public ListaDeReproduccion(String nombre) {
		this.nombre = nombre;
		this.canciones = new Cancion[NUMERO_MAXIMO_DE_CANCIONES];
	}

	// Metodos
	public boolean agregarCancion(Cancion nueva) {
		boolean sePudoAgregar = false;
		for (int i = 0; i < canciones.length; i++) {
			if (canciones[i] == null) {
				canciones[i] = nueva;
				sePudoAgregar = true;
				return sePudoAgregar;
			}
		}
		return sePudoAgregar;
	}

	public boolean eliminarCancion(String nombreDeLaCancion) {
		boolean sePudoEliminar = false;
		for (int i = 0; i < canciones.length; i++) {
			// no usar = canciones[i] == nombreDeLaCancion, ya q' utilizaria la direccion en
			// memoria, y no es lo q' queremos.
			if (canciones[i] != null && canciones[i].getNombre().equals(nombreDeLaCancion)) {
				canciones[i] = null;
				sePudoEliminar = true;
			}
		}
		return sePudoEliminar;
	}

	@Override
	public String toString() {
		return "ListaDeReproduccion [nombre=" + nombre + ", canciones=" + Arrays.toString(canciones) + "]";
	}

	public String getNombre() {
		return this.nombre;
	}

	public String reproducirLista() {
		String resultado = "";
		int contadorDeCanciones = 0;
		long duracionDeLaLista = 0;

		for (int i = 0; i < canciones.length; i++) {
			if (canciones[i] != null) {
				duracionDeLaLista += this.canciones[i].getDuracionEnSegundos();
				resultado += i + "-" + canciones[i].toString();
				contadorDeCanciones++;
			}

		}
		resultado += "La cantidad de canciones es:" + contadorDeCanciones + " \n la duracion total de la lista es:"
				+ duracionDeLaLista;
		return resultado;
	}

}
