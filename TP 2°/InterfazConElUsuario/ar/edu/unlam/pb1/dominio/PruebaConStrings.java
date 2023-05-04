package ar.edu.unlam.pb1.dominio;

public class PruebaConStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String oracion  = "java es case sensitive";
		System.out.println("Tiene "+ oracion.length() + " caracteres");
		
		String mayuscula = oracion.toUpperCase();
		System.out.println("La variable oracion en mayuscula es: "+ mayuscula + ".");
	}

}
