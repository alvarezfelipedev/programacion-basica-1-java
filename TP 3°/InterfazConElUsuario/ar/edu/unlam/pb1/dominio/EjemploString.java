package ar.edu.unlam.pb1.dominio;

public class EjemploString {
	public static void main(String[] args) {
		String texto1 = new String("Hola");
		String texto2 = new String("Hola");
		
		if(texto1 == texto2) {
			System.out.println("Los textos son iguales");
		} else {
			System.out.println("Los textos son distintos");
		}
		
		// CON EL METODO EQUALS
		if(texto1.equals(texto2)) {
			System.out.println("Los texto son iguales, utilzando equals");
		} else {
			System.out.println("Los texto son distintos, utilzando equals");
		}
	}
}
