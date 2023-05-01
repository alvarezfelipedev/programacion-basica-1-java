package ar.edu.unlam.pb1;

public class Coche {
	private final int CERO_KM = 0;
	private final int ANO_ACTUAL = 2023;
	private static int cantidadCoches;
	private String marca;
	private String modelo;
	private int kilometrosActuales;
	private int anioDeFabricacion;
	private double precio;
	
	// CONSTRUCTORES
	
	public Coche(String marca, String modelo, double precio) {
		this.marca = marca;
		this.modelo = modelo ;
		this.precio = precio;
	}
	
	public Coche(String marca, String modelo, int kilometros, int ano, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.kilometrosActuales = kilometros;
		this.anioDeFabricacion = ano;
		this.precio = precio;
	}
	
	// METODOS
	public static int getCantidadCoches() {
		return cantidadCoches;
	}
	
	public void setCantidadCoches() {
		cantidadCoches++;
	}
	
	public void setKilometrosActuales(int kilometros) {
		kilometrosActuales += kilometros;
	}
	
	public void setPrecio(double precio) {
		this.precio =+ precio;
	}
	
	public double getPrecio(){
		return precio;
	}
	
	public void calcularAntiguedad() {
		this.anioDeFabricacion = this.ANO_ACTUAL - this.anioDeFabricacion;
	}
	
	public int getCalcularAntiguedad() {
		return anioDeFabricacion;
	}
	
	public int getKilometros() {
		return kilometrosActuales;
	}
	
}
