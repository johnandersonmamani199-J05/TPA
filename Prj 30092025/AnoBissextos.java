package prj30092025;
import java.util.Scanner;

public class AnoBissextos{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int ai, af, i;
		int ab=0;

		System.out.println("Escreva o ano inicial:");
		ai = in.nextInt();
		System.out.println("Escreva o ano final:");
		af = in.nextInt();
		
		i=ai;
		
		while (i<=af) {
			if (i%4==0) {
				System.out.println(i);
				ab++;
			}
			i++;
		}
		System.out.println("São "+ab+ " anos bissexto(s)");
	}

}
