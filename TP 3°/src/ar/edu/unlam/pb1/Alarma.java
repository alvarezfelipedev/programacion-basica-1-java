package ar.edu.unlam.pb1;

public class Alarma {
	private boolean sensorDeMovimiento;
	private boolean sensorDeContacto;
	private boolean sensorDeSonido;
	private boolean encendida;
	private int codigoDeSeguridad;
	
	// Constructores
	public Alarma(int codigoDeSeguridad) {
		this.codigoDeSeguridad = codigoDeSeguridad;
	}
	
	// Metodos
	public void encender(int codigo) {
		if(this.codigoDeSeguridad == codigo) {
			encendida = true;
			sensorDeContacto = true;
			sensorDeMovimiento = true;
			sensorDeSonido = true;
		}
	}
	
	public void apagar(int codigo) {
		if(this.codigoDeSeguridad == codigo) {
			encendida = false;
			sensorDeContacto = false;
			sensorDeMovimiento = false;
			sensorDeSonido = false;
		}
	}
	
	public void activada(int codigo) {
		if(this.codigoDeSeguridad == codigo) {
			encendida = true;
		}
	}
	
}
