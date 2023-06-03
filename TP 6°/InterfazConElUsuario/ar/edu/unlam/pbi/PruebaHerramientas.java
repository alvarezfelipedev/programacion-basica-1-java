package ar.edu.unlam.pbi;

import java.util.Scanner;

public class PruebaHerramientas {

	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String args[]) {
		Destornillador destornilladorUtilizado = null;
		Tornillo tornillo = null;
		Tarugo tarugo = null;
		final int ELEGIR_DESTORNILLADOR = 1, ELEGIR_TORNILLO = 2, ELEGIR_TARUGO = 3, ATORNILLAR = 4, DESATORNILLAR = 5, SALIR = 9;

		int opcion = 0;
		do {
			mostrarMenu();
			opcion = teclado.nextInt();
			switch(opcion) {
			case ELEGIR_DESTORNILLADOR:
				destornilladorUtilizado = seleccionarDestornillador();
				break;
			case ELEGIR_TORNILLO:
				tornillo = seleccionarTornillo();
				break;
			case ELEGIR_TARUGO:
				tarugo = seleccionarTarugo();
				break;
			case ATORNILLAR:
				atornillar(destornilladorUtilizado, tornillo, tarugo);
				break;
			case DESATORNILLAR:
				desatornillar(destornilladorUtilizado, tornillo, tarugo);
				break;
			default:
				System.out.println("Opción inválida");
			}		
		} while(opcion!=SALIR);	
	}
	
	private static void mostrarMenu() {
		System.out.println("Opciones");
		System.out.println("1. Elegir Destornillador");
		System.out.println("2. Elegir Tornillo");
		System.out.println("3. Elegir el tarugo");
		System.out.println("4. Atornillar");
		System.out.println("5. Desatornillar");
		System.out.println("9. Salir");
		System.out.println("Ingrese la opción deseada");
	}

	private static Destornillador seleccionarDestornillador() {
		char cabezaSeleccionada;
		Destornillador nuevo;
		TipoDeCabeza cabeza = TipoDeCabeza.PLANA;
		
		System.out.println("Seleccione el tipo de cabeza (\n P - Plano, \n H - Phillips, \n A - Allen)");
		cabezaSeleccionada = teclado.next().charAt(0);
		switch(cabezaSeleccionada) {
		case 'P':
			cabeza = TipoDeCabeza.PLANA;
			break;
		case 'H':
			cabeza = TipoDeCabeza.PHILLIPS;
			break;
		case 'A':
			cabeza = TipoDeCabeza.ALLEN;
			break;
		}
		
		nuevo = new Destornillador(cabeza);
		return nuevo;
	}
	
	private static Tornillo seleccionarTornillo() {
		int longitud;
		int cantidadDeRosca;
		char cabezaSeleccionada;
		Tornillo nuevo;
		System.out.println("Seleccione el tipo de cabeza (\n P - Plano, \n H - Phillips, \n A - Allen)");
		cabezaSeleccionada = teclado.next().toUpperCase().charAt(0);
		System.out.println("Ingrese la longitud");
		longitud = teclado.nextInt();
		System.out.println("Ingrese la cantidad de rosca");
		cantidadDeRosca = teclado.nextInt();
		TipoDeCabeza cabeza = TipoDeCabeza.PLANA;
		switch(cabezaSeleccionada) {
		case 'P':
			cabeza = TipoDeCabeza.PLANA;
			break;
		case 'H':
			cabeza = TipoDeCabeza.PHILLIPS;
			break;
		case 'A':
			cabeza = TipoDeCabeza.ALLEN;
			break;
		}
		nuevo = new Tornillo(cabeza, longitud, cantidadDeRosca);
		return nuevo;
	}
	
	private static Tarugo seleccionarTarugo() {
		int longitud = 0;
		Tarugo nuevo;
		System.out.println("Ingrese la longitud del tarugo");
		longitud = teclado.nextInt();
		nuevo = new Tarugo(longitud);
		return nuevo;
	}
	
	private static void atornillar(Destornillador destornilladorSeleccionado, Tornillo tornilloSeleccionado, Tarugo tarugoSeleccionado) {
		System.out.println("Antes de atornillar");
		System.out.println(destornilladorSeleccionado);
		System.out.println(tornilloSeleccionado);
		System.out.println(tarugoSeleccionado);
		
		if(tarugoSeleccionado==null) {
			destornilladorSeleccionado.atornillar(tornilloSeleccionado);
		}
		else {
			destornilladorSeleccionado.atornillar(tornilloSeleccionado, tarugoSeleccionado);
		}
		
		System.out.println("Después de atornillar");
		System.out.println(destornilladorSeleccionado);
		System.out.println(tornilloSeleccionado);
		System.out.println(tarugoSeleccionado);
	}
	
	private static void desatornillar(Destornillador destornilladorSeleccionado, Tornillo tornilloSeleccionado, Tarugo tarugoSeleccionado) {
		System.out.println("Antes de desatornillar");
		System.out.println(destornilladorSeleccionado);
		System.out.println(tornilloSeleccionado);
		System.out.println(tarugoSeleccionado);
		
		if(tarugoSeleccionado==null) {
			destornilladorSeleccionado.desatornillar(tornilloSeleccionado);
		}
		else {
			destornilladorSeleccionado.desatornillar(tornilloSeleccionado, tarugoSeleccionado);
		}
		
		System.out.println("Después de desatornillar");
		System.out.println(destornilladorSeleccionado);
		System.out.println(tornilloSeleccionado);
		System.out.println(tarugoSeleccionado);
	}
}
