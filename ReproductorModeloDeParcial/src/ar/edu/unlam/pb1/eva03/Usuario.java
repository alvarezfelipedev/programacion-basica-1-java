package ar.edu.unlam.pb1.eva03;

public class Usuario {
	private String nombre;
	private int edad;
	private ListaDeReproduccion[] misListasDeReproduccion;
	private final int CANTIDAD_MAXIMAS_DE_LISTAS = 50;

	// Constructor
	public Usuario() {
		this.misListasDeReproduccion = new ListaDeReproduccion[CANTIDAD_MAXIMAS_DE_LISTAS];
		this.nombre = "";
		this.edad = 0;
	}

	// Metodos
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean agregarNuevaLista(String nombreDeLaLista) {
		boolean sePudoAgregar = false;
		ListaDeReproduccion nueva = new ListaDeReproduccion(nombreDeLaLista);
		for (int i = 0; i < misListasDeReproduccion.length; i++) {
			if (misListasDeReproduccion[i] == null) {
				misListasDeReproduccion[i] = nueva;
				sePudoAgregar = true;
				return sePudoAgregar;
			}
		}
		return sePudoAgregar;
	}

	public ListaDeReproduccion[] getMisListasDeReproduccion() {
		return misListasDeReproduccion;
	}

	public String verMisListasDeReproduccion() {
		String listasParaVer = "";
		for (int i = 0; i < misListasDeReproduccion.length; i++) {
			if (misListasDeReproduccion[i] != null) {
				listasParaVer += i + "-" + misListasDeReproduccion[i].getNombre() + "\n";
			}
		}
		return listasParaVer;
	}
	
	public String reproducirLista(int numeroDeLaLista) {
		String resultado = "";

		ListaDeReproduccion laListaSeleccionada = misListasDeReproduccion[numeroDeLaLista];
		
		resultado = laListaSeleccionada.reproducirLista();
		
		return resultado;
	}
	
	public void agregarCancion(int numeroDeLista, Cancion nueva) {
		misListasDeReproduccion[numeroDeLista].agregarCancion(nueva);
	}
}
