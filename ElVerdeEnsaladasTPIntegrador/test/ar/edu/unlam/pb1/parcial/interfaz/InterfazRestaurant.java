package ar.edu.unlam.pb1.parcial.interfaz;

import ar.edu.unlam.pb1.parcial.dominio.*;
import java.util.Arrays;

public class InterfazRestaurant {
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

	public static void main(String args[]) {

		final int CANTIDAD_MAXIMA_DE_INGREDIENTES = 50;
		final int CANTIDAD_MAXIMA_DE_ENSALADAS = 10;
		final int CANTIDAD_MAXIMA_DE_PEDIDOS_POR_DIA = 100;

		Ingrediente ingredientesDisponibles[] = new Ingrediente[CANTIDAD_MAXIMA_DE_INGREDIENTES];
		Ensalada ensaladasPreEstablecidas[] = new Ensalada[CANTIDAD_MAXIMA_DE_ENSALADAS];
		Pedido pedidos[] = new Pedido[CANTIDAD_MAXIMA_DE_PEDIDOS_POR_DIA];

		// Deberiamos ver los ingredientes disponibles de acuerdo a la ensalada elegida
		// por el usuario?
		ingredientesDisponibles = inicializarIngredientes();
		ensaladasPreEstablecidas = inicializarEnsaladasPrestablecidas();
		
		for (int i = 0; i < ensaladasPreEstablecidas.length; i++) {
			System.out.println(i + "-" + ensaladasPreEstablecidas[i].toString());
		}
		
		for (int i = 0; i < ingredientesDisponibles.length; i++) {
			System.out.println(i + "-" + ingredientesDisponibles[i].getNombre());
		}
		System.out.println("Bienvenido al Verde");

		/*
		 * En esta secci�n del c�digo se debe generar la interacci�n con el usuario. Se
		 * pueden incorporar tantos m�todos como considere necesario. M�nimamente se
		 * debe invocar a los siguientes m�todos:
		 * 
		 * incorporarNuevoIngrediente crearUnNuevaEnsalada crearUnNuevoPedido
		 */

	}

	private static void incorporarNuevoIngrediente() {

		/*
		 * Se crean nuevos ingredientes los cuales pueden ser utilizados en los platos
		 */
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
	
	
	
	private static Ensalada[] inicializarEnsaladasPrestablecidas () {
		
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

		Ensalada ensaladasNuestras[] = {caesar, waldorf, rusa, coleslaw, caprese, fideosVegetales, mixta, griega, veggie}; 
		
		return ensaladasNuestras;
	}

	private static void crearUnNuevoPedido() {
		/*
		 * PRIMEROOOO ACA ELIJE LA ENSALADA
		 * 
		 * Se muestra el listado de ensaladas, y el cliente elige la ensalada deseada.
		 * Una vez elegida la ensalada el cliente puede incorporar nuevos ingredientes.
		 * Al finalizar informa el valor que debe abonar.
		 */
	}

	private static void crearUnNuevaEnsalada() {
		// DESPUES ACÄ SE LE AGREGA INGREDIENTES A LA ENSALADA YA ELEJIDA
		//Ensalada cesar = new Ensalada();
		// cesar.agregarIngrediente(pollo);
		// cesar.agregarIngrediente(POLLO);

		/*
		 * Se visualiza el listado de ingredientes disponibles y a partir de ah� se
		 * crean nuevos platos, los cuales pueden ser solicitados por los clientes
		 */
	}
}