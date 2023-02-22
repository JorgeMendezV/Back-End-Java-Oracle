package FirstCourseAlura;

public class EjemploCondicionales2 {
	public static void main (String[] args) {
		
		// optimizacion de codigo
		
		int edad = 17;
		int cantidadPersonas = 2;
		
		// variables boolean primitiva
		
		boolean esPareja = true;
		
		// evitar redundancias con las condiciones booleanas
		
		System.out.println("El valor de la condicion es: " + esPareja);
		boolean puedeEntrar = (edad >= 18 && esPareja);
		if (puedeEntrar) {
			System.out.println("Usted puede entrar");
		} else {
			System.out.println("Usted no esta permitido a entrar");
		}
	}

}
