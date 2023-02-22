package FirstCourseAlura;

public class EjemploCaracteres {

	public static void main(String[] args) {
		
		// primitivos long char
		
		// string objeto de java
		
		char caracter = 'a';
		System.out.println(caracter);
		
		caracter = 65;
		
		System.out.println(caracter);
		
		caracter = 65 + 1;
		
		char segundoCaracter = (char) (caracter + 1);
		
		System.out.println(segundoCaracter);
		
		
		String palabra = "Alura cursos online";
		
		System.out.println(palabra);
		
		palabra = palabra + " 2020";
		
		System.out.println(palabra);
		
		
		// como se guardan a nivel de memoria??
		
		int numero1 = 5;
		int numero2 = 9;
		
		System.out.println(numero2);
		
		numero2 = numero1;
		
		numero1 = 88;
		
		System.out.println(numero2);
		
		
	}

}
