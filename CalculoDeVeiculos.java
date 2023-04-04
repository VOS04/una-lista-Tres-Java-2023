package calculoEstacionamentos;
import java.util.Scanner;


public class CalculoDeVeiculos {
	 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);

	    System.out.println("Digite o total de veículos no estacionamento: ");
	    int totalVeiculos = input.nextInt();

	    System.out.println("Digite o total de rodas no estacionamento: ");
	    int totalRodas = input.nextInt();

	    int motos = (totalRodas - 4 * totalVeiculos) / 2;
	    int carros = totalVeiculos - motos;
	    System.out.println("Há " + carros + " carros e " + motos + " motos no estacionamento.");
	
	input.close();
	
}
}
