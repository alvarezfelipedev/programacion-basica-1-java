package prueba4;

public class testearCodigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int capacidadHdd = 1; // Expresada en TERA
		double capacidadDvd = 8.5; // Expresada en GIGA
		double capacidadBlueRay = 25.0; // Expresada en GIGA
		double cantidadDeDvdsParaBackupearHdd;
		double cantidadBlueRaysParaBackupearHdd;
		
		int conversionDeUnidad = 1024;
		
		cantidadDeDvdsParaBackupearHdd = ((capacidadHdd*conversionDeUnidad)/capacidadDvd);
		cantidadBlueRaysParaBackupearHdd = 	((capacidadHdd*conversionDeUnidad)/capacidadBlueRay);
		
		System.out.println("Cantidad de DVD que se necesitan para backupear el disco rigido: " + cantidadDeDvdsParaBackupearHdd);
		System.out.println("Cantidad de Blue Ray que se necesitan para backupear el disco rigido: " + cantidadBlueRaysParaBackupearHdd);
	}

}
