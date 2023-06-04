package ar.edu.unlam.pb1.dominio;

import ar.edu.unlam.pb1.Hacker;
import java.util.Scanner;
public class PruebaHacker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el saldo inicial");
        int saldoInicial = scanner.nextInt();

        Hacker cuenta = new Hacker(saldoInicial);
        cuenta.calcularSaldo();
		
        scanner.close();
	}

}
