package ejercicios_ifs;

public class ejercicio4 {

	public static void main(String[] args) {
		// Pedir dos numeros y decir cual es mayor
		
		int numero1;
		int numero2;
		
		numero1 = 7;
		numero2 = 8;
		
		if(numero1>numero2) {
			System.out.println( +numero1+ " es mayor que " +numero2 );
		}
		
		else if(numero1<numero2) {
			System.out.println( +numero1+ " es menor que " +numero2 );
		}
		
		else {
			System.out.println("Son iguales");
		}

	}

}
