package media;

import java.util.Scanner;

public class ExcecicoMedia_aritmetica {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o Pirmeiro Numero:");
		float numero1 = input.nextFloat();

		System.out.println("Digite o segundo numero:");
		float numero2 = input.nextFloat();

		float resultado = numero1 + numero2 / 2;

		System.out.println("O reultado da média é:" + resultado);
		
		input.close();
	}

}
