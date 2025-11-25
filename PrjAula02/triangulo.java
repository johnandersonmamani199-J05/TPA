package prjAula02;
import java.util.Scanner;

public class triangulo {
	public static void main(String[] args) {

		//criando um scarnner chamado ler
		Scanner ler = new Scanner(System.in);

		double base, altura, area;
		
		System.out.println("Digite o valor 1:");
		base = ler.nextDouble(); //leia(base)
		
		System.out.println("Digite o valor 1:");
		altura = ler.nextDouble(); //leia(altura)
		
		area = (base*altura)/2; //cálculo da area
		System.out.println("Sua area é:  "+ area +"²");
		ler.close();
	}
}
