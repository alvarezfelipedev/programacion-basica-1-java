package ar.edu.unlam.pbi;

public class Destornillador {
	
	private final TipoDeCabeza CABEZA;

	public Destornillador(TipoDeCabeza cabeza) {
		this.CABEZA = cabeza;
	}
	
	public void atornillar(Tornillo tornilloAAtornillar) {
		boolean sePudoGirar = true;
		
		if(this.CABEZA==tornilloAAtornillar.getCabeza()) {
			while(sePudoGirar==true) {
				sePudoGirar = tornilloAAtornillar.girar(SentidoDeGiro.HORARIO);
			}	
		}
	}
	
	public void atornillar(Tornillo tornilloAAtornillar, Tarugo tarugoActual) {
		boolean sePudoGirar = true;
		
		if(this.CABEZA==tornilloAAtornillar.getCabeza() && tornilloAAtornillar.getLongitud()<=tarugoActual.getLongitud()) {
			while(sePudoGirar==true) {
				sePudoGirar = tornilloAAtornillar.girar(SentidoDeGiro.HORARIO);
			}	
		}
	}
	
	public void desatornillar(Tornillo tornilloADesatornillar) {
		boolean sePudoGirar = true;
		
		if(this.CABEZA==tornilloADesatornillar.getCabeza()) {
			while(sePudoGirar==true) {
				sePudoGirar = tornilloADesatornillar.girar(SentidoDeGiro.ANTI_HORARIO);
			}	
		}
	}
	
	public void desatornillar(Tornillo tornilloADesatornillar, Tarugo tarugoActual) {
		boolean sePudoGirar = true;
		
		if(this.CABEZA==tornilloADesatornillar.getCabeza() && tornilloADesatornillar.getLongitud()<=tarugoActual.getLongitud()) {
			while(sePudoGirar==true) {
				sePudoGirar = tornilloADesatornillar.girar(SentidoDeGiro.ANTI_HORARIO);
			}	
		}
	}

	@Override
	public String toString() {
		return "Destornillador [CABEZA=" + CABEZA + "]";
	}

}
