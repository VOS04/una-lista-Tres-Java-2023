package calculoDeSalario;
import java.util.Scanner;
public class CalcularSalarioBruto {

	public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 
 int numeroHoras = 0;
 double valorHoras = 0;
 double salarioFamilia = 56.47;
 int numeroFilhos = 0;
 double salario = 0;
 
 System.out.println("Informe a quanidade de horas trabalhada no mês:");
 numeroHoras = input.nextInt();
 
 System.out.println("Informe o Valor recebido por horas R$:");
 valorHoras = input.nextDouble();
 
 salario = numeroHoras * valorHoras;
 
 if(salario < 1655.98) {
	 
	 System.out.println("O valor do Salario Bruto R$:" + salario);
 }
 else {
	 System.out.println("Quantidade de filho até 14 anos:");
	 numeroFilhos = input.nextInt();
	 salario = salario + (numeroFilhos *salarioFamilia);
	 
	 System.out.println("O valor do Salario Brunto é:"+ salario);
 }
 
 
 input.close();
	}

}
