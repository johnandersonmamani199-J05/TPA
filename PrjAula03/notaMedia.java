package prjAula03;
import java.util.Scanner;

public class notaMedia {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double nota1, nota2, nota3, nota4, media;
		
		System.out.println("Insira a nota 1:");
		nota1 = ler.nextDouble();
		
		System.out.println("Insira a nota 2:");
		nota2 = ler.nextDouble();

		System.out.println("Insira a nota 3:");
		nota3 = ler.nextDouble();
		
		System.out.println("Insira a nota 4:");
		nota4 = ler.nextDouble();
		
		media = (nota1+nota2+nota3+nota4)/4; //calculo da media
		System.out.println("Sua media é:"+ media);
		
		ler.close ();
	}
}
