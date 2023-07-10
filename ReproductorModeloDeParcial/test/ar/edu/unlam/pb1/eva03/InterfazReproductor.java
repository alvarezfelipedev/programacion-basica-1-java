package ar.edu.unlam.pb1.eva03;

import java.util.Scanner;

public class InterfazReproductor {
	
	public static void main(String args[]) {
			
		Scanner teclado = new Scanner(System.in);
	System.out.println("Bienvenido al reproductor de la Unlam");
	Usuario elUsuarioDeEsteDispositivo = new Usuario();
	Cancion cancionero[] = obtenerCancionesDisponibles();
	final int GUARDAR_MIS_DATOS_PERSONALES = 1, CREAR_UNA_LISTA_DE_REPRODUCCION = 2, AGREGAR_CANCIONES_A_UNA_LISTA = 3, REPRODUCIR_UNA_LISTA = 4, SALIR = 9;
	int opcion = 0;
	
	do {
		menu();
		
		opcion = teclado.nextInt();
		
		switch(opcion) {
		case GUARDAR_MIS_DATOS_PERSONALES:
			String nombre = "";
			int edad = 0;
			
			System.out.println("Ingrese su nombre");
			nombre = teclado.next();
			elUsuarioDeEsteDispositivo.setNombre(nombre);
			
			System.out.println("Ingrese su edad");
			edad = teclado.nextInt();
			elUsuarioDeEsteDispositivo.setEdad(edad);
			
			break;
		case CREAR_UNA_LISTA_DE_REPRODUCCION:
			String nombreDeLaLista = "";
			
			System.out.println("Ingrese el nombre de la lista que desea crear");
			nombreDeLaLista = teclado.next();
			
			if(elUsuarioDeEsteDispositivo.agregarNuevaLista(nombreDeLaLista) == true) {
				System.out.println("Se creo la lista");
			}else {
				System.out.println("La lista no se creo, por espacio insuficiente");
			}
			
			break;
		case AGREGAR_CANCIONES_A_UNA_LISTA:
			Cancion cancionSeleccionada;
			int numeroDeCancion;
			int numeroDeListaSeleccionada;
			
			System.out.println("Estas son las canciones disponibles");
			for(int i = 0; i < cancionero.length; i++) {
				System.out.println(i + "-" + cancionero[i]);
			}
			
			System.out.println("Que cancion desea agregar?");
			numeroDeCancion = teclado.nextInt();
			cancionSeleccionada = cancionero[numeroDeCancion];
			
			System.out.println("Seleccione la lista donde desea agregar la cancion");
			System.out.println(elUsuarioDeEsteDispositivo.verMisListasDeReproduccion());
			numeroDeListaSeleccionada = teclado.nextInt();
			elUsuarioDeEsteDispositivo.agregarCancion(numeroDeListaSeleccionada, cancionSeleccionada);
			
			break;
		case REPRODUCIR_UNA_LISTA:
			int listaSeleccionada;
			
			System.out.println("Que lista desea reproducir?");
			listaSeleccionada = teclado.nextInt();
			System.out.println(elUsuarioDeEsteDispositivo.reproducirLista(listaSeleccionada));
			
			break;
		case SALIR:
			break;
			
			default: System.out.println("Opcion incorrecta");
		}
	}
	while(opcion!=SALIR);

	teclado.close();
}

	/**
	 * 
	 */
	private static void menu() {
		System.out.println("************************");
		System.out.println("Menu de opciones\n");
		System.out.println("1 - Guardar mis datos personales");
		System.out.println("2 - Crear una lista de reproduccion ");
		System.out.println("3 - Agregar canciones a una lista");
		System.out.println("4 - Reproducir una lista");
		System.out.println("9 - Salir");
		System.out.println("************************");
	}

public static Cancion[] obtenerCancionesDisponibles() {
	
	Cancion cancionero [] = {new Cancion("Latinoamerica", "Rock", 120, "Calle 13"),
			new Cancion("Latinoamerica", "Rock", 120, "Calle 13"),
			new Cancion("Dime mentiras", "Pop", 85, "Carla Morrison"),
			new Cancion("Antes y Despu�s", "Rock", 63, "Ciro y los Persas"),
			new Cancion("Ala Delta", "Rock", 50, "Divididos"),
			new Cancion("La Rueda M�gica", "Rock", 63, "Fito Paez"),
			new Cancion("Moscas en la casa", "Latino", 94, "Shakira"),
			new Cancion("San Jaureche", "Rock", 122, "Los Piojos"),
			new Cancion("Come As You Are", "Rock", 86, "Nirvana"),
			new Cancion("Una Lady Como t�", "Desconocido", 45, "Manuel Turizo"),
			new Cancion("Smells Like Teen Spirit", "Rock", 93, "Nirvana"),
			new Cancion("Verte Re�r", "Rock", 85, "No te va a gustar"),
			new Cancion("Ji Ji Ji", "Rock", 76, "Patricio Rey y sus redonditos de Ricota"),
			new Cancion("Una cervez", "Cumbia", 33, "R�faga"),
			new Cancion("La leyenda del Hada", "Rock", 113, "Rata Blanca"),
			new Cancion("Me extra�ar�s", "Cuarteto ", 85, "Ulises Bueno"),
			new Cancion("Si te vas ", "Latino", 93, "Shakira"),
			new Cancion("Sea of Teeth", "Funk", 85, "Sparkehorse"),
			new Cancion("Hello Sunshine", "Chill Out", 76, "Super Furry Animals"),
			new Cancion("It's not the end of the world", "Chill Out", 90, "Super Furry Animals"),
			new Cancion("No se llama amor", "Rock", 83, "Turf"),
			new Cancion("Pasos al costado", "Rock", 93, "Turf"),
			new Cancion("November Rain", "Rock", 110, "Guns & Roses"),
			new Cancion("Way Back Into Love", "Movies", 90, "Hugh Grant & Drew Barrymore"),
			new Cancion("Auto Rojo", "Retro", 87, "Vilma Palma e Vampiros"),
			new Cancion("Bella", "Pop", 80, "Wolfine"),
			new Cancion("True to Myself", "Reagee", 120, "Ziggy Marley"),
			new Cancion("See Dem Fake Lead", "Reagee", 56, "Ziggy Marley"),
			new Cancion("Casi Nadie", "Rock", 116, "Los Caballeros de la Quema"),
			new Cancion("Sombra de T�", "Pop", 110, "Shakira"),
			new Cancion("Don't Stop Me Now", "Rock", 116, "Queen"),
			new Cancion("Huelga de Princesas", "Rock", 110, "Los Caballeros de la Quema"),
			};
	
		return cancionero;
	}
}
