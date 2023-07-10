package ar.edu.unlam.pb1;

import java.util.Arrays;

public class Cumple {

	/***
	 * Se deben agregar todos los atributos que se requieran.
	 */

	private int cuantosCumple;
	private String tematica;
	private Invitado[] invitados;
	private final int CANTIDAD_MAXIMA_INVITADOS = 100;

	/****
	 * El constructor debe realizar todas las acciones necesarias para garantizar el
	 * correcto funcionamiento
	 * 
	 * @param cuantosCumple Esto es un valor num�rico que identifica los a�os que se
	 *                      celebran en el presente cumplea�os
	 * @param tematica      Esto es una variable de tipo String que denota la
	 *                      tem�tica del cumplea�os.
	 */
	public Cumple(int cuantosCumple, String tematica) {
		this.cuantosCumple = cuantosCumple;
		this.tematica = tematica;
		this.invitados = new Invitado[CANTIDAD_MAXIMA_INVITADOS];
	}
	
	public Cumple() {
	}

	/***
	 * Agrega un nuevo invitado a la lista de invitados del cumplea�os
	 * 
	 * @param nuevo - El invitado a agregar
	 * @return Devuelve true si se pudo agregar al nuevo invitado o false en caso
	 *         contrario.
	 */
	public boolean agregarInvitado(Invitado nuevo) {
		for (int i = 0; i < invitados.length; i++) {
			if (invitados[i] == null) {
				invitados[i] = nuevo;
				return true;
			}
		}
		return false;
	}

	/***
	 * Este m�todo busca un invitado en la lista de invitados a partir de su nombre.
	 * 
	 * @param nombre Nombre del invitado a buscar.
	 * @return Devuelve invi si encuentra al invitado o false en caso contrario.
	 */
	public Invitado buscar(String nombre) {
		for(int i = 0; i < invitados.length; i++) {
			if(invitados[i] != null && invitados[i].getNombre().equals(nombre)) {
				return invitados[i];
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "Cumple [CUANTOS CUMPLE=" + cuantosCumple + ", TEMATICA=" + tematica + ", INVITADOS="
				+ Arrays.toString(invitados) + ", CANTIDAD MAXIMA DE INVITADOS=" + CANTIDAD_MAXIMA_INVITADOS + "]";
	}

}
