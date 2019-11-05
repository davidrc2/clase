package inicio;

public class start {

	public static void main(String[] args) {
		
		//variables
		int numero1, numero2;
		int suma, resta, multiplicacion, division, resto;
		
		//leemos datos
		numero1 = 10;
		numero2 = 5;
		suma = numero1 + numero2;
		resta = numero1 - numero2;
		multiplicacion = numero1 * numero2;
		division = numero1 / numero2;
		resto = numero1 % numero2;
		
		//muestra en pantalla todo lo que he puesto arriba
		System.out.println("suma: "+suma);
		System.out.println("resta: "+resta);
		System.out.println("multiplicacion: " +multiplicacion);
		System.out.println("division: " +division);
		System.out.println("resto de división: " +resto);
	}

}
