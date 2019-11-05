package startJugando;
import java.util.Scanner;

public class startJugando2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean alarma = false;
		int temperatura = 10000;
		boolean extintoresFuncionando = false;

		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce una temperatura");
		temperatura = teclado.nextInt();

		if (temperatura > 500) {

			alarma = true;
			extintoresfuncionando = true;
		}

		if ((alarma == true) && (extintoresFuncionando == true)) {

			alarma = false;
		}

		System.out.println("alarma " + alarma);
		System.out.println("extintoresFuncionando " + extintoresFuncionando);
	}

}
