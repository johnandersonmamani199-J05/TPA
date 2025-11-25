package prjListaApostilaPrjAula29072025;
import java.util.Scanner;

public class MediaExame {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

		double n1, n2, n3, n4, mi, ex, nm;
		
		System.out.println("Entre com a primeira nota");
		n1 = in.nextDouble();
		
		System.out.println("Entre com a segunda nota");
		n2 = in.nextDouble();
		
		System.out.println("Entre com a terceira nota");
		n3 = in.nextDouble();
		
		System.out.println("Entre com a quarta nota");
		n4 = in.nextDouble();
		
		mi = (n1+n2+n3+n4)/4;
		
		System.out.println("A média é: "+mi);
		
		if (mi>=7) {
			System.out.println("Aprovado");
		} else if (mi<5) {
			System.out.println("Reprovado");
		} else {
			System.out.println("Exame");
		}
		
		System.out.println("Entre com a nota do exame");
		
		ex = in.nextDouble();
		
		nm = (mi+ex)/2;
		
		System.out.println("Sua nova média é: "+nm);
		
		if (nm>=7) {
			System.out.println("Aprovado em exame");
		} else {
			System.out.println("Reprovado em exame");
		}
	}
}
