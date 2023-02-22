package FirstCourseAlura;

public class EjemploScope {
	public static void main (String[] args) {
		
		// scope es el alcance de las variables
		
		int edad = 17;
		int cantidadPersonas = 2;
		//boolean esPareja = true;
		
		
		// todo boolean por defecto es false
		// Java no permite utilizar variables no utilizadas
		boolean esPareja;
		// System.out.println(esPareja);
		if(cantidadPersonas > 1) {
			esPareja = true;
		} else {
			esPareja = false;
		}
		
		System.out.println("El valor de la condicion es: " + esPareja);
		boolean puedeEntrar = (edad >= 18 && esPareja);
		if (puedeEntrar) {
			System.out.println("Usted puede entrar");
		} else {
			System.out.println("Usted no esta permitido a entrar");
		}
	}

}
