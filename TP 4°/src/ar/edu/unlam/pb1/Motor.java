package ar.edu.unlam.pb1;

public class Motor {
	
	private int tipoBomba;
	private String tipoFluido;
	private String combustible;
	
	//Constructor
	public Motor() {
		this.tipoBomba = 0;
		this.tipoFluido = "Sin-asignar";
		this.combustible = "Nafta";
	}
	
	//Metodos
	
	public String dimeTipoMotor() {
		String resultado = "";
		
		switch(this.tipoBomba) {
		case 0:
			resultado = "No hay un valor establecido para el de tipo bomba";
			break;
		case 1:
			resultado = "La bomba es una bomba de agua";
			break;
		case 2:
			resultado = "La bomba es de gasolina";
			break;
		case 3:
			resultado = "La bomba es de una bomba de hormigon";
			break;
		case 4:
			resultado = "La bomba es una bomba de pasta alimenticia";
			break;
		default:
			resultado = "No existe un valor definido para la bomba";
			break;
		}
		return resultado;
	}
	
	public int getTipoBomba() {
		return tipoBomba;
	}
	
	public void setTipoBomba(int tipoBomba) {
		this.tipoBomba = tipoBomba;
	}
	
	public String getTipoFluido() {
		return tipoFluido;
	}
	
	public void setTipoFluido(String tipoFluido) {
		this.tipoFluido = tipoFluido;
	}
	
	public String getCombustible() {
		return combustible;
	}
	
	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
}
