package ar.edu.unlam.pb1;

import java.util.Arrays;

public class Cumpleaniero {

	/***
	 * Se deben agregar todos los atributos que se requieran.
	 */
	private String nombre;
	private Cumple [] listaDeCumpleanios;
	private final int CANTIDAD_MAXIMA_CUMPLES = 50;
	
	/***
	 * El constructor debe realizar todas las acciones necesarias para garantizar el correcto funcionamiento
	 * @param nombre - Este es el nombre del cumplea�iero
	 */
	public Cumpleaniero(String nombre) {
		this.nombre = nombre;
		this.listaDeCumpleanios = new Cumple[CANTIDAD_MAXIMA_CUMPLES];
	}
	
	public String getNombreCumpleanierio() {
		return this.nombre;
	}
	
	/***
	 * Este m�todo agrega un nuevo cumplea�os a la lista de cumplea�os del cumplea�ero. 
	 * @param cuantosCumple Este par�metro identifica un�vocamente al cumplea�os y representa los a�os que cumple.
	 * @param tematica Este par�metro es un string de texto libre que identifica la tem�tica del cumplea�os.
	 * @return true si se  pudo agregar y false en caso contrario.
	 */
	public boolean nuevoCumple(int cuantosCumple, String tematica) {
		Cumple nuevo = new Cumple(cuantosCumple, tematica);
		for(int i = 0; i < listaDeCumpleanios.length; i++) {
			if(listaDeCumpleanios[i] == null) {
				listaDeCumpleanios[i] = nuevo;
				return true;
			}
		}
		return false;
	}
	
	/***
	 * Agrega un nuevo invitado a un cumplea�os determinado. Es importante recordar que primero se debe generar el c�digo de invitaci�n para asociarlo al nuevo invitado.
	 * @param aQueCumple - Determina a qu� cumplea�os se agrega el nuevo invitado
	 * @param nombre - Es el nombre del invitado
	 * @param esAdulto - Indica si el invitado es adulto o no
	 * @return Devuelve el c�digo de invitaci�n asociado al nuevo invitado. Si no se pudo agregar al invitado al cumplea�os se devuelve -1
	 */
	public int agregarInvitado(int aQueCumple, String nombre, boolean esAdulto) {
		int codigo = calcularCodigoInvitacion();
		for(int i = 0; i < listaDeCumpleanios.length; i++) {
			if(aQueCumple >= 0 && aQueCumple <= listaDeCumpleanios.length && listaDeCumpleanios[aQueCumple] != null) {
				Invitado nuevo = new Invitado(nombre, esAdulto, codigo);
				listaDeCumpleanios[aQueCumple].agregarInvitado(nuevo);
				return nuevo.getCodigoInvitacion();
			}
		}
		
		return -1;
	}
	
	/***
	 * Este algoritmo debe generar un c�digo de invitaci�n aleatorio entre 1 y 1000. El c�digo se puede repetir entre un invitado y otro, pero no se puede anticipar el c�digo generado
	 * @return Devuelve el c�digo de invitaci�n generado.
	 */
	public int calcularCodigoInvitacion() {
		int codigo = (int) ((Math.random() * 1000) + 1);
		return codigo;
	}

	/***
	 * Este m�todo primero debe buscar al invitado en el cumplea�os al que desea
	 * confirmar su asistencia. Si lo encuentra, confirma su asistencia.
	 * 
	 * @param cumpleAlQueConfirma Cumplea�os al que un invitado confirma su
	 *                            asistencia.
	 * @param nombre              Nombre del invitado que env�a la confirmaci�n
	 * @return Devuelve true para el caso que se haya confirmado la invitaci�n y
	 *         false en caso contrario
	 */
	public boolean confirmar(int cumpleAlQueConfirma, String nombre) {
		for(int i = 0; i < listaDeCumpleanios.length; i++) {
			if(cumpleAlQueConfirma >= 0 && cumpleAlQueConfirma < listaDeCumpleanios.length && listaDeCumpleanios[cumpleAlQueConfirma] != null) {
				Invitado invitadoABuscar = listaDeCumpleanios[cumpleAlQueConfirma].buscar(nombre);
				invitadoABuscar.confirmar();
				return true;
			}
		}
		return false;
	}
	
	/****
	 * Este m�todo primero debe buscar al invitado en el cumplea�os al que desea asistir. Si lo encuentra, debe verificar que el invitado haya confirmado su asistencia y que el c�digo recibido coincida con el generado al momento de enviar la invitaci�n.
	 * @param cumpleAlQueAsiste - Cumplea�os al que el invitado est� asistiendo
	 * @param nombre - Nombre del invitado
	 * @param codigoAsistencia - C�digo de asistencia con el que el invitado desea ingresar al sal�n.
	 * @return Devuelve true si el invitado puede asistir o false para los siguientes casos:
	 * 	 * Si el invitado no existe en el cumplea�os
	 * 	 * Si el invitado no hab�a confirmado previamente su asistencia
	 *   * Si el c�digo de invitaci�n no concide con el generado inicialmente 
	 */
	public boolean asistir(int cumpleAlQueAsiste, String nombre, int codigoAsistencia) {
		Invitado invitadoABuscar = listaDeCumpleanios[cumpleAlQueAsiste].buscar(nombre);
		boolean confirmar = confirmar(cumpleAlQueAsiste, nombre);
		
		if(confirmar == true && invitadoABuscar.getCodigoInvitacion() == codigoAsistencia) {
			invitadoABuscar.asistio();
			return true;
		} else if(invitadoABuscar == null || invitadoABuscar.getConfirmo() != true || invitadoABuscar.getCodigoInvitacion() != codigoAsistencia) {
			return false;
		}
		return false;
	}
	
	/****
	 * Devuelve un objeto Cumple asociado al n�mero recibido por par�metro
	 * @param numero N�mero de cumplea�os que se debe retornar
	 * @return El cumplea�os recibido por par�metro
	 */
	public Cumple getCumpleanios(int numero) {
			if(numero >= 0 && listaDeCumpleanios[numero] != null) {
				return listaDeCumpleanios[numero];
			}
		return null;
	}

	@Override
	public String toString() {
		return "Cumpleaniero [NOMBRE=" + nombre + ", LISTA DE CUMPLEANIOS=" + Arrays.toString(listaDeCumpleanios)
				+ ", CANTIDAD MAXIMA DE CUMPLES=" + CANTIDAD_MAXIMA_CUMPLES + "]";
	}
}
