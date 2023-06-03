package ar.edu.unlam.pbi;

public class Tarugo {

	private final int LONGITUD;
	
	public Tarugo(int longitud) {
		this.LONGITUD = longitud;
	}
	
	public int getLongitud() {
		return this.LONGITUD;
	}

	@Override
	public String toString() {
		return "Tarugo [LONGITUD=" + LONGITUD + "]";
	}
	
	
}
