package ejercicios_ifs;

public class ejercicio3 {

	public static void main(String[] args) {
		//Pedir dos numeros y decir si uno es multiplo de otro
		
		int numero1;
		int numero2;
		int resto;
		
		numero1 = 5;
		numero2 = 3;
		resto = numero1%numero2;
		
		
		if(resto==0) {
			System.out.println("Son multiplos");
		}
		
		if(resto!=0) {
			System.out.println("No son multiplos");
		}
	}

}
