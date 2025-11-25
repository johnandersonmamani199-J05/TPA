package prj30092025;
import java.util.Scanner;

public class IdadeCalculo {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
			
		int anoAtual, anoNasc, idade, n;
		
		do {
			
		System.out.println("Digite o ano atual:");
		anoAtual = in.nextInt();
		System.out.println("Digite o ano de nascimento:");
		anoNasc = in.nextInt();
		
		idade = anoAtual-anoNasc;
			
		System.out.println(idade+" anos");
			
		System.out.println("Deseja continuar? 1-SIM 0-NÃO");
			
		n = in.nextInt();
			
		}while (n==1);
	System.out.println("Programa finalizado");
	}	
}
