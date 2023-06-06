package ar.edu.unlam.pb1;

public class Hacker {
	private int saldoDeCuenta;
    private int saldoInicial;
    private double porcentaje = 0.1;

    public Hacker(int saldoInicial) {
        this.saldoInicial = saldoInicial;
        saldoDeCuenta = saldoInicial;
    }

    public void calcularSaldo() {
        while (saldoDeCuenta > (saldoInicial / 2)) {
            saldoDeCuenta -= (saldoDeCuenta * porcentaje);
            System.out.println("El saldo actual es de: " + saldoDeCuenta);
        }
    }
	
	
}
