package ar.edu.unlam.pb1.dominio;

import ar.edu.unlam.pb1.EstadisticasPersonas;
import java.util.Scanner;

public class PruebaEstadisticasPersonas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = 1;

		System.out.println("Ingrese la cantidad de muestras");
		int cantidadDeMuestras = scanner.nextInt();

		int peso = 0;

		int pesoPromedio = 1;

		int personasConBajoPeso = 0;
		int edadTotalDePersonasConBajoPeso = 0;

		int personasConPesoNormal = 0;

		int personasConSobrePeso = 0;
		int edadTotalDePersonasConSobrePeso = 0;

		while (numero <= cantidadDeMuestras) {
			System.out.println("Ingrese el peso");
			int pesoIngresadoPorElUsuario = scanner.nextInt();
			peso += pesoIngresadoPorElUsuario;

			System.out.println("Ingrese su edad");
			int edadIngresadaPorElUsuario = scanner.nextInt();

			EstadisticasPersonas persona = new EstadisticasPersonas(pesoIngresadoPorElUsuario,
					edadIngresadaPorElUsuario);

			if (persona.getPeso() <= 60) {
				personasConBajoPeso++;
				edadTotalDePersonasConBajoPeso += persona.getEdad();
			} else if (persona.getPeso() > 100) {
				personasConSobrePeso++;
				edadTotalDePersonasConSobrePeso += persona.getEdad();
			} else {
				personasConPesoNormal++;
			}
			numero++;
		}

		pesoPromedio = peso / cantidadDeMuestras;
		System.out.println("El peso promedio es: " + pesoPromedio + "kg");

		System.out.println("Personas con bajo peso: " + personasConBajoPeso);
		System.out.println("Personas con peso normal: " + personasConPesoNormal);
		System.out.println("Personas con sobrepeso: " + personasConSobrePeso);

		int promedioDeEdadDePersonasConBajoPeso = 0;
		if (personasConBajoPeso > 0) {
			promedioDeEdadDePersonasConBajoPeso = edadTotalDePersonasConBajoPeso / personasConBajoPeso;
		}
		System.out.println("El promedio de edad de personas con bajo peso es de " + promedioDeEdadDePersonasConBajoPeso);

		int promedioDeEdadDePersonasConSobrePeso = 0;
		if (personasConSobrePeso > 0) {
			promedioDeEdadDePersonasConSobrePeso = edadTotalDePersonasConSobrePeso / personasConSobrePeso;
		}
		System.out.println("El promedio de edad de personas con sobrepeso es de " + promedioDeEdadDePersonasConSobrePeso);

		scanner.close();
	}

}
