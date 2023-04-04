package calcularSalarioVendedor;

import java.util.Scanner;

public class CalcularSalarioDeVendedor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o salário fixo do vendedor: ");
		double salarioFixo = input.nextDouble();

		System.out.print("Digite o valor total das vendas realizadas pelo vendedor no mês: ");
		double totalVendas = input.nextDouble();

		System.out.print("Digite o percentual de comissão do vendedor: ");
		double percentualComissao = input.nextDouble();

		double salarioTotal = salarioFixo + (totalVendas * percentualComissao / 100);
		System.out.println("O salário total do vendedor é " + salarioTotal);

		input.close();
	}
}