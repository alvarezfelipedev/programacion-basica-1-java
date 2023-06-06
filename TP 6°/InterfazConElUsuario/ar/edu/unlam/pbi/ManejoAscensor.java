package ar.edu.unlam.pb1;

import java.util.Scanner;

public class ManejoAscensor {
	private final int PISO_MAXIMO = 15;
	private final int PISO_MINIMO = 1;

	// Metodo
	public void irAlPiso() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("El piso maximo es: 15 y el minimo es: 1");
		System.out.println("Si desea cancelar el metodo, coloque un numero mayor a 15");
		
		boolean continuar = true;
		
		while (continuar) {
			int numeroDePiso = teclado.nextInt();

			if (numeroDePiso > this.PISO_MAXIMO || numeroDePiso < this.PISO_MINIMO) {
				System.out.println("El numero de piso solicitado, es incorrecto, usted a salido del bucle");
				continuar = false;
				break;
			}
			System.out.println("Usted está en el piso, " + numeroDePiso);
		}
		teclado.close();
	}
}
