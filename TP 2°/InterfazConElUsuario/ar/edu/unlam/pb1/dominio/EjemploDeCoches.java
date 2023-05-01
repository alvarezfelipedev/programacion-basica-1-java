package ar.edu.unlam.pb1;

public class EjemploDeCoches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche miCochesito = new Coche("Ferrari", "812 Superfast", 5000000);
		System.out.println("El precio de mi primer coches es de: $" + miCochesito.getPrecio());
		
		Coche miSegundoCochesito = new Coche("Audi", "A5", 5000, 2005, 500000);
		System.out.println("El precio de mi segundo coches es de: $" + miSegundoCochesito.getPrecio());
		miSegundoCochesito.calcularAntiguedad();
		System.out.println("Es de hace " + miSegundoCochesito.getCalcularAntiguedad() + " anios");
		
		
		miCochesito.setCantidadCoches();
		System.out.println("Cantidad de coches: " + miCochesito.getCantidadCoches());

	}

}
