package produto;

import java.util.Scanner;

public class PrecoProduto {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o preço do Produto");
		double ValorProduto = input.nextFloat();
		double NovoValorProduto = ValorProduto + ((10.0 / 100) * ValorProduto);

		System.out.println("O Resultado do novo Valor é:" + NovoValorProduto);

		input.close();

	}

}
