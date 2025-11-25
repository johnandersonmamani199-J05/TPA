package prjAula03;
import java.util.Scanner;

public class salarioLiquido {
	public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);
	
	double horaAula, aulaMes, inss, salarioBruto, salarioLiquido, desconto;
	
	System.out.println("Insira o valor de hora por aula:");
	horaAula = ler.nextDouble();
	
	System.out.println("Insira a quantidade de aulas dadas por mês:");
	aulaMes = ler.nextDouble();

	System.out.println("Insira o imposto do inss:");
	inss = ler.nextDouble();
	
	salarioBruto = (horaAula*aulaMes); //calculo do salarioBruto
	System.out.println("Seu salário Bruto é R$:"+ salarioBruto);
	
	desconto = salarioBruto*inss; //calculo do desconto
	System.out.println("Seu desconto é R$:"+ desconto);
	
	salarioLiquido = salarioBruto-desconto; //calculo do salarioLiquido
	System.out.println("Seu salário líquido é R$:"+ salarioLiquido);
	
	ler.close ();
	}
}
