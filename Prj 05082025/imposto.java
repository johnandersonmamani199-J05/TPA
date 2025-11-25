package prj05082025;
import java.util.Scanner;

public class imposto {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int pessoa;
		double imposto, salario, inss;
		
		salario = in.nextDouble();
		inss = in.nextDouble();
		pessoa = in.nextInt();

		if(salario<=4011.20){
			imposto = 0;
			System.out.println("R$"+imposto);
		}else if(salario>4011.20 && salario<=5120){
			imposto = (salario*0.15)-601.68;
			System.out.println("R$"+imposto);

		}else {
			imposto = (salario*0.275)-1241.68;
			System.out.println("R$"+imposto);
		}
		

	}

}
