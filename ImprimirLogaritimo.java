package calcular;

import java.util.Scanner;

public class ImprimirLogaritimo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		double numero1 = input.nextDouble();

		System.out.print("Digite o segundo número: ");
		double numero2 = input.nextDouble();

		double resultado = Math.log(numero1) / Math.log(numero2);
		System.out.println("O logaritmo do primeiro número na base representada pelo segundo número é " + resultado);
		
		input.close();
	}

}
