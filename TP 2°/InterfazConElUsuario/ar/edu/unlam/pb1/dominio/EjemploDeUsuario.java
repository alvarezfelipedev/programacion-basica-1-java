package ar.edu.unlam.pb1.dominio;

import ar.edu.unlam.pb1.Usuario;

public class EjemploDeUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario lucas = new Usuario("Lucas001", "soyElMejor", "Lucas", "Mudryk", 4321521, 18);
		
		System.out.println(lucas.getUsuario());
		lucas.setUsuario("Luquitas123");
		System.out.println("Mi nuevo usuario es: " + lucas.getUsuario());
		
		System.out.println(lucas.getContrasenia());
		lucas.setContrasenia("pizza");
		System.out.println("Mi nueva contrasenia es " + lucas.getContrasenia());
		
		System.out.println(lucas.getEdad());
		lucas.setEdad(20);
		System.out.println("Mi nueva edad es " + lucas.getEdad());

	}

}
