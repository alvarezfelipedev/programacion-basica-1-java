package ar.edu.unlam.pbi;

public class Tornillo {

	private final TipoDeCabeza CABEZA;
	private final int LONGITUD;
	private final int CANTIDAD_DE_ROSCA;
	private int posicionActual;
	
	public Tornillo(TipoDeCabeza cabeza, int longitud, int cantidadDeRosca) {
		this.CABEZA = cabeza;
		this.LONGITUD = longitud;
		this.CANTIDAD_DE_ROSCA = cantidadDeRosca;
		this.posicionActual = 0;
	}
	
	public Tornillo() {
		this.CABEZA = TipoDeCabeza.PLANA;
		this.LONGITUD = 10;
		this.CANTIDAD_DE_ROSCA = 10;
		this.posicionActual = 0;
	}
	
	public int getLongitud() {
		return this.LONGITUD;
	}
	
	public TipoDeCabeza getCabeza() {
		return this.CABEZA;
	}
	
	public boolean girar(SentidoDeGiro sentido) {
		boolean sePudoGirar = false;
		
		if(sentido == SentidoDeGiro.HORARIO && posicionActual<CANTIDAD_DE_ROSCA) {
			posicionActual++;
			sePudoGirar = true;
		}
		else if(sentido == SentidoDeGiro.ANTI_HORARIO && posicionActual>0) {
			posicionActual--;
			sePudoGirar = true;
		}
		
		return sePudoGirar;
	}

	@Override
	public String toString() {
		return "Tornillo [CABEZA=" + CABEZA + ", LONGITUD=" + LONGITUD + ", CANTIDAD_DE_ROSCA=" + CANTIDAD_DE_ROSCA
				+ ", posicionActual=" + posicionActual + "]";
	}
	
}
