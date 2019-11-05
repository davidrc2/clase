import java.util.Scanner;

public class ejercicioForTemperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		int suma = 0;
		int veces = 0;
		
		for (int i=1;i<=7;i++) {
			
			System.out.println("Esribe el "+i+" numero");
			numero = teclado.nextInt();
			
			suma = suma + numero;
			veces = veces+1;
	}
	System.out.println("Media = "+(suma/veces));
}

}