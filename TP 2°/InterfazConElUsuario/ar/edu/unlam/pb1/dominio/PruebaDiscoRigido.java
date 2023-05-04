package ar.edu.unlam.pb1.dominio;
import ar.edu.unlam.pb1.DiscoRigido;

public class PruebaDiscoRigido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiscoRigido seagate = new DiscoRigido();
		System.out.println("10 TB de seagate son: " + seagate.conversoraDVD(10) + " en DVD's");
		System.out.println("10 TB de seagate son: " + seagate.conversoraBlueRay(10) + " en Blue Rays");
		
		DiscoRigido hitachi = new DiscoRigido();
		System.out.println("20 TB de westernDigital son: " + hitachi.conversoraDVD(20) + " en DVD's");
		System.out.println("20 TB de westernDigital: " + hitachi.conversoraBlueRay(20) + " en Blue Rays");
		
		DiscoRigido westernDigital = new DiscoRigido();
		System.out.println("32 TB de westernDigital son: " + westernDigital.conversoraDVD(32) + " en DVD's");
		System.out.println("32 TB de westernDigital: " + westernDigital.conversoraBlueRay(32) + " en Blue Rays");
		
		DiscoRigido toshiba = new DiscoRigido();
		System.out.println("48 TB de toshiba son: " + toshiba.conversoraDVD(48) + " en DVD's");
		System.out.println("48 TB de toshiba: " + toshiba.conversoraBlueRay(48) + " en Blue Rays");
	}

}
