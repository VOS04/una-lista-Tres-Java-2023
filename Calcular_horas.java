package calculoDeHoras;

import java.util.Scanner;

public class Calcular_horas {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Digite o número de segundos: ");
		int totalSegundos = input.nextInt();

		int segundos = totalSegundos % 60;
		int minutos = (totalSegundos / 60) % 60;
		int horas = totalSegundos / 3600;

		System.out.println(totalSegundos + " segundos correspondem a " + horas + " horas, " + minutos + " minutos e "
				+ segundos + " segundos.");
		input.close();
	}

}
