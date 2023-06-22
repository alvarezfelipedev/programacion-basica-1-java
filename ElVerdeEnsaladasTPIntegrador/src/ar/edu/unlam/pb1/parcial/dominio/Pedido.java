package ar.edu.unlam.pb1.parcial.dominio;

public class Pedido {
	private String nombreDelCliente;
	private Ensalada[] ensaladas;
	
	
	public Pedido(String nombreDelCliente, Ensalada[] ensaladas) {
		this.nombreDelCliente = nombreDelCliente;
		this.ensaladas = ensaladas;
	}
	
	public String getNombreCliente() {
		return this.nombreDelCliente;
	}
	
	public boolean agregarNuevaEnsalada(Ensalada nueva) {
		/*
		 * Se incorpora una nueva ensalada a la lista del pedido actual
		 */
		for (int i = 0; i < ensaladas.length; i++) {
			if(ensaladas[i] == null) {
				ensaladas[i] = nueva;
				return true;
			}
		}
		return false;
	}
	
	public double getImporte() {
		/*
		 * Calcula el importe en funci�n del precio de cada ingrediente
		 */
		double precioParcial = 0.0;
		for (int i = 0; i < ensaladas.length; i++) {
			for (int j = 0; j < ensaladas[i].getIngredientes().length; j++) {
				Ingrediente ingredientes[] = ensaladas[i].getIngredientes();
				precioParcial += ingredientes[j].getPrecio();
			}
		}
		return precioParcial;
	}
}

