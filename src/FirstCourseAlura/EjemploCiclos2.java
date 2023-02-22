package FirstCourseAlura;

public class EjemploCiclos2 {
	public static void main(String[] args) {
		
		int contador = 0;
		int sum= 0;
		while(contador <= 10) {
			System.out.println(contador);
			sum = contador+sum;
			contador ++;
		}
		
		System.out.println(sum);
	}

}
