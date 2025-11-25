package prjAula04;
import java.util.Scanner;
public class SalarioMinimo {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		double salario, minimo;
		
		System.out.println("Digte o seu salário:");
		salario = in.nextDouble();
		minimo = 1302.00;
		if (salario<minimo) {
			System.out.println("abaixo do salário minimo");
		} else {
			System.out.println("acima ou igual do salário minimo");
		}
		
	}
}
