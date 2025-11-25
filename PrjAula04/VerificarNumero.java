package prjAula04;
import java.util.Scanner;
public class VerificarNumero {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n;
		
		System.out.println("Digite um número");
		n = in.nextInt();
		if (n==0) {
			System.out.println("Número Neutro");
		} else if(n>0) {
			System.out.println("Número Positivo");
		} else {
			System.out.println("Número Negativo");
		}
	}
}

