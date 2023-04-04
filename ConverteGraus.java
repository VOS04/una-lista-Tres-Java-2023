package conversor;

import java.util.Scanner;

public class ConverteGraus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite a temperatura em  Fahrenheit:");
		double fahrenheit = input.nextDouble();

		double fahrenheit_para_celsius = (fahrenheit - 32) / 1.8;
		System.out.println("O valor convertido em Celsius é:" + fahrenheit_para_celsius);

		input.close();

	}

}
