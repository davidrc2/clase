package ejercicios_ifs;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Pedir dos numeros y decir cual es el mayor o si son iguales
		
		
		int numero1;
		int numero2;
		
		numero1 = 5;
		numero2 = 5;
		
		if(numero1>numero2) {
			System.out.println( +numero1+ " es mayor que " +numero2 );
		}
		
		else if(numero1==numero2){
			System.out.println(+numero1+ " y " +numero2+ " son iguales ");
		}
		else if(numero1<numero2) {
			System.out.println( +numero1+ " es menor que " +numero2 );
		}

		

	}

}
