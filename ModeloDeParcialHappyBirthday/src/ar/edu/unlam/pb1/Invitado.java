package ar.edu.unlam.pb1;

public class Invitado {

	/***
	 * Se deben agregar todos los atributos que se requieran.
	 */
	private String nombre;
	private boolean esAdulto;
	private int codigoInvitacion;
	private String estadoDelInvitado;

	/***
	 * El constructor debe realizar todas las acciones necesarias para garantizar el
	 * correcto funcionamiento
	 * 
	 * @param nombre           Nombre del invitado
	 * @param esAdulto         Si es adulto o no
	 * @param codigoInvitacion C�digo de invitaci�n que permitir� confirmar que el
	 *                         invitado es leg�timo a la hora de asistir al sal�n
	 */
	public Invitado(String nombre, boolean esAdulto, int codigoInvitacion) {
		this.nombre = nombre;
		this.esAdulto = esAdulto;
		this.codigoInvitacion = codigoInvitacion;
		this.estadoDelInvitado = "Pendiente de Confirmacion";
	}

	/***
	 * Devuelve el nombre del invigtado
	 * 
	 * @return Nombre del invitado
	 */
	public String getNombre() {
		return this.nombre;
	}

	/***
	 * Actualiza el nombre del invitado
	 * 
	 * @param nombre El nuevo nombre del invitado
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/****
	 * Devuelve si el invitado es un adulto
	 * 
	 * @return True si es adulto o false en caso contrario
	 */
	public boolean esAdulto() {
		if (this.esAdulto == true) {
			return true;
		}
		return false;
	}

	/***
	 * Actualiza el estado del invitado, confirmando su asistencia.
	 */
	public void confirmar() {
		this.estadoDelInvitado = "Confirmado";
	}
	
	public void asistio() {
		this.estadoDelInvitado = "Asistio";
	}

	/***
	 * Devuelve el estado de confirmaci�n del invitado
	 * 
	 * @return true si confirmo su asistencia y false en caso contrario
	 */
	public boolean getConfirmo() {
		if (this.estadoDelInvitado.equals("Confirmado")) {
			return true;
		}
		return false;
	}

	/***
	 * Actualiza el estado de asistencia de un invitado
	 * 
	 * @param codigoInvitacion al evento
	 * @return true si se pudo confirmar su asistencia o false en caso contrario
	 *         (cuando el c�digo de asistencia no coincide con el definido
	 *         inicialmente)
	 */
	public boolean asistir(int codigoInvitacion) {
		if (this.codigoInvitacion == codigoInvitacion) {
			confirmar();
			return true;
		}
		return false;
	}
	
	public int getCodigoInvitacion() {
		return this.codigoInvitacion;
	}

	public String toString() {
		return "Invitado [NOMBRE=" + nombre + ", ES ADULTO=" + esAdulto + ", CODIGO DE INVITACION=" + codigoInvitacion
				+ ", ESTADO DEL INVITADO=" + estadoDelInvitado + "]";
	}
}
