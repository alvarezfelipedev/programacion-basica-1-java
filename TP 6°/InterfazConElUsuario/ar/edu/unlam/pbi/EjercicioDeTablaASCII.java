package ar.edu.unlam.pb1.dominio;

public class EjercicioDeTablaASCII {

	public static void main(String[] args) {

		System.out.println("Caracteres numericos:");
		int numero = 0;
		int caracter = 48;
		while (numero <= 9 && caracter <= 57) {
			System.out.print(caracter + " - " + numero + ", ");
			caracter++;
			numero++;

		}
		System.out.println("\n");
		
		System.out.println("Letras minusculas:");
		char letra = 'a';
		int numASCII = 97;
		while (letra <= 'z' && numASCII <= 122) {
			System.out.print(numASCII + "-" + letra + ", ");
			numASCII++;
			letra++;
		}
		System.out.println("\n");
		
		System.out.println("Letras mayusculas:");
		char letraMayus = 'A';
		int caracterASCII = 65;
		while(letraMayus <= 'Z' && caracterASCII <= 90) {
			System.out.print(caracterASCII + "-" + letraMayus + ", ");
			caracterASCII++;
			letraMayus++;
		}
		System.out.println("\n");

		System.out.println("Caracteres especiales:");
		char caracterEspecial = '!';
		int numeroASCII = 33;
		while(caracterEspecial <= '/' && numeroASCII <= 47) {
			System.out.print(numeroASCII + "-" + caracterEspecial + ", ");
			numeroASCII++;
			caracterEspecial++;
		}
	}

}
