package FirstCourseAlura;

public class EjemploMatriz {
	public static void main(String[] args) {
		for (int fila = 0; fila <=10; fila ++) {
			for (int columna = 0; columna < fila; columna ++) {
				
				//if(columna > fila) {
					// solo aplica al ciclo donde esta contenido, saldra del scope al ciclo anterior
					//break;
				//}
				
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
			
		}
		
	}

}
