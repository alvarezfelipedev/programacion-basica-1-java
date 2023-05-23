package ar.edu.unlam.edu.dominio;

import java.util.Scanner;

import ar.edu.unlam.pb1.Calculadora;

public class EjemploCalculadora {

	public static void main(String[] args) {
		// Calculadora calcular = new Calculadora(2, 4);
		// int resultadoPotencia = calcular.potencia();
		// System.out.println(resultadoPotencia);
		
		Calculadora numeroACalcular = new Calculadora();
		
		//Sumatoria
		int resultadoSumatoria = numeroACalcular.sumatoria(5);
		System.out.println("La sumatoria es: " + resultadoSumatoria);
        
		// Limite inferior y limite superior.
		int limiteInferior = 1;
        int limiteSuperior = 10;
        int resultado = numeroACalcular.sumatoria(limiteInferior, limiteSuperior);
        System.out.println("La suma entre " + limiteInferior + " y " + limiteSuperior + " es: " + resultado);
        
        // Producto con un limite
        int productoriaLimite = numeroACalcular.productoria(4);
        System.out.println("El producto hasta el limite establecido es de: " + productoriaLimite);
        
        // Producto con limite inferior y limite superior
        int productoriaConLimiteInfYSuperior = numeroACalcular.productoria(2, 4);
        System.out.println("El producto hasta el limite establecido es de: " + productoriaConLimiteInfYSuperior);
        
        // Contar divisores
        Scanner scanner = new Scanner(System.in);
        Calculadora casio = new Calculadora();
        int numeroIngresado = 0;
        
        System.out.println("Vamos a calcular la cantidad de divisores");
        System.out.println("Ingre el numero que desea contar");
        numeroIngresado = scanner.nextInt();
        System.out.println("La cantidad de divisores es: " + casio.contarDivisores(numeroIngresado));
        
        scanner.close();
	}

}
