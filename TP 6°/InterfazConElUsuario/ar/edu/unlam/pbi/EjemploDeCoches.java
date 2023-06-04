package ar.edu.unlam.pb1.dominio;

import ar.edu.unlam.pb1.Coche;
import java.util.Scanner;

public class EjemploDeCoches {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese la velocidad incial");
		int velocidadInicial = scanner.nextInt();
		
		System.out.println("Ingrese el tiempo");
		int tiempo = scanner.nextInt();

		Coche vehiculo = new Coche(velocidadInicial, tiempo);
		
        double tiempoAlcanzarMaxima = vehiculo.alcanzarVelocidadMaxima(100);
        
        System.out.println("Tiempo necesario para alcanzar la velocidad máxima: " + tiempoAlcanzarMaxima + " segundos");

        scanner.close();
	}

}
