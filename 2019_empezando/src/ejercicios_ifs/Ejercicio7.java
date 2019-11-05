package ejercicios_ifs;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Pedir tres numeros y mostrarlos ordenador de mayor a menor
		
		int n1;
		int n2;
		int n3;
		
		n1 = 3;
		n2 = 5;
		n3 = 1;
		
		if ((n1>n2)&&(n1>n3)) {
			
			//numero1 es el mayor
			if(n2>n3) {
						System.out.println(n1+ " > " +n2+ " > " +n3);
		}

		
		else if (n3>n2) {
			System.out.println(n1+ " > " +n3+" > " +n2);
		}
		else {
			System.out.println("Hay numeros repetidos");
		}
		}
		
		if ((n2>n1))
		
}
