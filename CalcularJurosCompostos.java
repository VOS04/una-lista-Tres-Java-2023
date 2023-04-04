package cauclarJuros;

import java.util.Scanner;

public class CalcularJurosCompostos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o valor do capital em R$:");
		double capital = input.nextDouble();

		System.out.println("Digite o prazo da aplicação em meses:");
		double prazo = input.nextDouble();

		System.out.println("Digite o valor da taxa de juros mensal:");
		double taxaDeJurosMensal = input.nextDouble();

		double montante = capital * (Math.pow((1 + taxaDeJurosMensal) / 100, prazo));

		System.out.println("O montante a ser recebido é: R$" + montante);

		input.close();

	}

}
