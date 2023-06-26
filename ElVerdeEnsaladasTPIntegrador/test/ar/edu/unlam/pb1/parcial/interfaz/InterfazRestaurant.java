package ar.edu.unlam.pb1.parcial.interfaz;

import ar.edu.unlam.pb1.parcial.dominio.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class InterfazRestaurant {
	
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String args[]) {
		final int CANTIDAD_MAXIMA_DE_INGREDIENTES = 50;
		final int CANTIDAD_MAXIMA_DE_ENSALADAS = 10;
		final int CANTIDAD_MAXIMA_DE_PEDIDOS_POR_DIA = 100;

		Ingrediente ingredientesDisponibles[] = new Ingrediente[CANTIDAD_MAXIMA_DE_INGREDIENTES];
		Ensalada ensaladasPreEstablecidas[] = new Ensalada[CANTIDAD_MAXIMA_DE_ENSALADAS];
		Pedido pedidos[] = new Pedido[CANTIDAD_MAXIMA_DE_PEDIDOS_POR_DIA];

		ingredientesDisponibles = inicializarIngredientes();
		ensaladasPreEstablecidas = inicializarEnsaladasPrestablecidas();
		
		/*
		 * En esta secci�n del c�digo se debe generar la interacci�n con el usuario. Se
		 * pueden incorporar tantos m�todos como considere necesario. M�nimamente se
		 * debe invocar a los siguientes m�todos:
		 * 
		 * incorporarNuevoIngrediente crearUnNuevaEnsalada crearUnNuevoPedido
		 */

		/*
		 * - 1 elija una ensalada
		 * - 2 desea agregar ingredientes?
		 * Si: mostrar ingredientes y que elija de esas opciones
		 * No: continua con el pedido
		 * - 3:Desea agregar otra ensalada?
		 * Si: volver al paso 2
		 * No: finalizar pedido y mostrar precio
		 */
		String nombreCliente;
		
		System.out.println("Bienvenido al Verde");
		System.out.println("Ingrese su nombre:");
		nombreCliente = teclado.next();
		//System.out.println("Elija una ensalada:");
		char seguirPidiendo;
		
		Pedido pedido = new Pedido(nombreCliente);
		
		
		do {
			Ensalada nuevaEnsalada = crearUnNuevoPedido(ensaladasPreEstablecidas, ingredientesDisponibles);
			pedido.agregarNuevaEnsalada(nuevaEnsalada);
			//System.out.println(prueba.getImporte());
			for (int i = 0; i < pedidos.length; i++) {
				pedidos[i] = pedido;
				
			}
			System.out.println("Desea agregar otra ensalada? SI o NO");
			seguirPidiendo = teclado.next().toLowerCase().charAt(0);
			
		} while (seguirPidiendo == 's');
		
		System.out.println("El pedido de: " + pedido.getNombreCliente() + ", tiene un total de: $" + pedido.getImporte());
		

		

	}

	private static boolean incorporarNuevoIngrediente(Ingrediente[] ingredientesDisponibles, Ensalada ensaladaElegida) {
		/*
		 * Se crean nuevos ingredientes los cuales pueden ser utilizados en los platos
		 */
		System.out.println("Elija el ingrediente:");
		for (int i = 0; i < ingredientesDisponibles.length; i++) {
			System.out.println((i + 1) + "-" + ingredientesDisponibles[i].getNombre());
		}
		System.out.println();

		int opcionElegida = teclado.nextInt();
		Ingrediente ingredienteElegido = ingredientesDisponibles[opcionElegida - 1];
		System.out.println(ingredienteElegido.getNombre());
		
		boolean sePudoAgregar = ensaladaElegida.agregarIngrediente(ingredienteElegido);
		System.out.println(ensaladaElegida.toString());
		return sePudoAgregar;
	}

	private static Ingrediente[] inicializarIngredientes() {
		Ingrediente ingredientes[] = { new Ingrediente("Lechuga", 30.0, Origen.VEGETAL),
				new Ingrediente("Huevo", 8.0, Origen.HUEVO), new Ingrediente("Pan tostado", 15.0, Origen.TACC),
				new Ingrediente("Juego de Limon", 20.0, Origen.VEGETAL),
				new Ingrediente("Aceite de Oliva", 80.0, Origen.VEGETAL),
				new Ingrediente("Queso rallado", 80.0, Origen.LECHE), new Ingrediente("Manzana", 15.0, Origen.VEGETAL),
				new Ingrediente("Frutos secos", 100.0, Origen.VEGETAL), new Ingrediente("Apio", 20.0, Origen.VEGETAL),
				new Ingrediente("Repollo", 25.0, Origen.VEGETAL), new Ingrediente("Mayonesa", 50.0, Origen.HUEVO),
				new Ingrediente("Zanahoria", 10.0, Origen.VEGETAL), new Ingrediente("Papa", 15.0, Origen.VEGETAL),
				new Ingrediente("Arvejas", 30.0, Origen.VEGETAL), new Ingrediente("Manzana", 15.0, Origen.VEGETAL),
				new Ingrediente("Col", 20.0, Origen.VEGETAL), new Ingrediente("Cebolla", 10.0, Origen.VEGETAL),
				new Ingrediente("Tomate", 10.0, Origen.VEGETAL), new Ingrediente("Mozzarella", 80.0, Origen.LECHE),
				new Ingrediente("Albahaca", 30.0, Origen.VEGETAL), new Ingrediente("Aceitunas", 50.0, Origen.VEGETAL),
				new Ingrediente("Choclo", 20.0, Origen.VEGETAL), new Ingrediente("Alcaparras", 40.0, Origen.VEGETAL),
				new Ingrediente("Queso", 60.0, Origen.LECHE), new Ingrediente("Pepinos", 15.0, Origen.VEGETAL),
				new Ingrediente("Morron", 25.0, Origen.VEGETAL), new Ingrediente("Pollo", 100.0, Origen.ANIMAL) };

		return ingredientes;
	}

	private static Ensalada[] inicializarEnsaladasPrestablecidas() {

		Ensalada caesar = new Ensalada("Caesar");
		caesar.agregarIngrediente(lechuga);
		caesar.agregarIngrediente(huevo);
		caesar.agregarIngrediente(panTostado);
		caesar.agregarIngrediente(jugoLimon);
		caesar.agregarIngrediente(aceiteOliva);
		caesar.agregarIngrediente(quesoRallado);

		Ensalada waldorf = new Ensalada("Waldorf");
		waldorf.agregarIngrediente(manzana);
		waldorf.agregarIngrediente(frutosSecos);
		waldorf.agregarIngrediente(apio);
		waldorf.agregarIngrediente(repollo);
		waldorf.agregarIngrediente(mayonesa);

		Ensalada rusa = new Ensalada("Rusa");
		rusa.agregarIngrediente(zanahoria);
		rusa.agregarIngrediente(papa);
		rusa.agregarIngrediente(mayonesa);
		rusa.agregarIngrediente(arvejas);
		rusa.agregarIngrediente(huevo);

		Ensalada coleslaw = new Ensalada("Coleslaw");
		coleslaw.agregarIngrediente(zanahoria);
		coleslaw.agregarIngrediente(manzana);
		coleslaw.agregarIngrediente(col);
		coleslaw.agregarIngrediente(mayonesa);
		coleslaw.agregarIngrediente(cebolla);

		Ensalada caprese = new Ensalada("Caprese");
		caprese.agregarIngrediente(tomate);
		caprese.agregarIngrediente(quesoMozzarella);
		caprese.agregarIngrediente(albahaca);
		caprese.agregarIngrediente(aceiteOliva);

		Ensalada fideosVegetales = new Ensalada("Fideos y Vegetales");
		fideosVegetales.agregarIngrediente(lechuga);
		fideosVegetales.agregarIngrediente(tomate);
		fideosVegetales.agregarIngrediente(aceitunas);
		fideosVegetales.agregarIngrediente(choclo);
		fideosVegetales.agregarIngrediente(arvejas);

		Ensalada mixta = new Ensalada("Mixta");
		mixta.agregarIngrediente(lechuga);
		mixta.agregarIngrediente(tomate);
		mixta.agregarIngrediente(cebolla);

		Ensalada griega = new Ensalada("Griega");
		griega.agregarIngrediente(lechuga);
		griega.agregarIngrediente(tomate);
		griega.agregarIngrediente(alcaparras);
		griega.agregarIngrediente(quesoDanbo);
		griega.agregarIngrediente(pepinos);
		griega.agregarIngrediente(morron);
		griega.agregarIngrediente(aceitunas);

		Ensalada veggie = new Ensalada("Veggie");
		veggie.agregarIngrediente(lechuga);
		veggie.agregarIngrediente(tomate);
		veggie.agregarIngrediente(cebolla);
		veggie.agregarIngrediente(aceitunas);
		veggie.agregarIngrediente(morron);
		veggie.agregarIngrediente(zanahoria);

		Ensalada ensaladasNuestras[] = { caesar, waldorf, rusa, coleslaw, caprese, fideosVegetales, mixta, griega,
				veggie };

		return ensaladasNuestras;
	}

	private static Ensalada crearUnNuevoPedido(Ensalada[] ensaladasPreEstablecidas, Ingrediente[] ingredientesDisponibles) {
		/*
		 * PRIMEROOOO ACA ELIJE LA ENSALADA
		 * 
		 * Se muestra el listado de ensaladas, y el cliente elige la ensalada deseada.
		 * Una vez elegida la ensalada el cliente puede incorporar nuevos ingredientes.
		 * Al finalizar informa el valor que debe abonar.
		 */
		
		// itera y muestra las ensaladas prestablecidas
		System.out.println("Elija una ensalada:");
		for (int i = 0; i < ensaladasPreEstablecidas.length; i++) {
			System.out.print((i + 1) + "-" + ensaladasPreEstablecidas[i].toString());
			if (ensaladasPreEstablecidas[i].esAptoCeliaco()) {
				System.out.println("\n[ES APTO CELIACO] ");
			}
			if (ensaladasPreEstablecidas[i].esAptoVegano()) {
				System.out.println("[ES APTO VEGANO] ");
				
			}
			if (ensaladasPreEstablecidas[i].esAptoVegetariano()) {
				System.out.println("[ES APTO VEGETARIANO] ");
			}
		}
		System.out.println("0 - Volver");
		
		//GUARDAMOS OPCION ELEGIDA
		int opcionElegida = teclado.nextInt();
		
		Ensalada ensaladaElegida;
		
		do {
			ensaladaElegida = ensaladasPreEstablecidas[opcionElegida - 1];
			System.out.println("Elegiste: " + ensaladaElegida.getNombre());
			

				char opcionElegida2;
				boolean sePudoAgregar = true;
				do {
					System.out.println("Desea agregar ingredientes?: SI o NO");
					opcionElegida2 = teclado.next().toLowerCase().charAt(0);
					
					switch (opcionElegida2) {
					case 's': {
						//LLAMAMOS AL METODO crearUnNuevaEnsalada() Y LE PASAMOS LA OPCION ELEGIDA POR EL CLIENTE,
						//LAS ENSALADAS PRE ESTABLECIDAS y los ingredientes
						sePudoAgregar = crearUnNuevaEnsalada(sePudoAgregar, ensaladaElegida, ingredientesDisponibles);
						break;
					}
					case 'n': {
						break;
					}
					}
				} while (opcionElegida2=='s' && sePudoAgregar);
								
		} while (opcionElegida == 0);
		
		return ensaladaElegida;
	}

	private static boolean crearUnNuevaEnsalada(Boolean sePudoAgregar, Ensalada ensaladaElegida, Ingrediente[] ingredientesDisponibles) {
		
		/*
		 * Se visualiza el listado de ingredientes disponibles y a partir de ah� se
		 * crean nuevos platos, los cuales pueden ser solicitados por los clientes
		 */
		//Recibimos la ensalada elegida, los ingredientes disponibles.. Se llama al metodo incorporarNuevoIngrediente y se devuelve si se pudo agregar o no.
		sePudoAgregar = incorporarNuevoIngrediente(ingredientesDisponibles, ensaladaElegida);
		if(!sePudoAgregar) {
			System.out.println("No se pueden agregar mas de 10 ingredientes");
		}
		return sePudoAgregar;

	}

	static Ingrediente lechuga = new Ingrediente("Lechuga", 30.0, Origen.VEGETAL);
	static Ingrediente huevo = new Ingrediente("Huevo", 8.0, Origen.HUEVO);
	static Ingrediente panTostado = new Ingrediente("Pan tostado", 15.0, Origen.TACC);
	static Ingrediente jugoLimon = new Ingrediente("Juego de Limon", 20.0, Origen.VEGETAL);
	static Ingrediente aceiteOliva = new Ingrediente("Aceite de Oliva", 80.0, Origen.VEGETAL);
	static Ingrediente quesoRallado = new Ingrediente("Queso rallado", 80.0, Origen.LECHE);
	static Ingrediente manzana = new Ingrediente("Manzana", 15.0, Origen.VEGETAL);
	static Ingrediente frutosSecos = new Ingrediente("Frutos secos", 100.0, Origen.VEGETAL);
	static Ingrediente apio = new Ingrediente("Apio", 20.0, Origen.VEGETAL);
	static Ingrediente repollo = new Ingrediente("Repollo", 25.0, Origen.VEGETAL);
	static Ingrediente mayonesa = new Ingrediente("Mayonesa", 50.0, Origen.HUEVO);
	static Ingrediente zanahoria = new Ingrediente("Zanahoria", 10.0, Origen.VEGETAL);
	static Ingrediente papa = new Ingrediente("Papa", 15.0, Origen.VEGETAL);
	static Ingrediente arvejas = new Ingrediente("Arvejas", 30.0, Origen.VEGETAL);
	static Ingrediente col = new Ingrediente("Col", 20.0, Origen.VEGETAL);
	static Ingrediente cebolla = new Ingrediente("Cebolla", 10.0, Origen.VEGETAL);
	static Ingrediente tomate = new Ingrediente("Tomate", 10.0, Origen.VEGETAL);
	static Ingrediente quesoMozzarella = new Ingrediente("Mozzarella", 80.0, Origen.LECHE);
	static Ingrediente albahaca = new Ingrediente("Albahaca", 30.0, Origen.VEGETAL);
	static Ingrediente aceitunas = new Ingrediente("Aceitunas", 50.0, Origen.VEGETAL);
	static Ingrediente choclo = new Ingrediente("Choclo", 20.0, Origen.VEGETAL);
	static Ingrediente alcaparras = new Ingrediente("Alcaparras", 40.0, Origen.VEGETAL);
	static Ingrediente quesoDanbo = new Ingrediente("Queso", 60.0, Origen.LECHE);
	static Ingrediente pepinos = new Ingrediente("Pepinos", 15.0, Origen.VEGETAL);
	static Ingrediente morron = new Ingrediente("Morron", 25.0, Origen.VEGETAL);
}

