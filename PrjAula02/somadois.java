package prjAula02;
import java.util.Scanner;

public class somadois {
	public static void main(String[] args) {
		
		//criando um scarnner chamado Soma
		Scanner ler = new Scanner(System.in);
		
		double valor1, valor2, soma;
		
		System.out.println("Digite o valor 1:");
		valor1 = ler.nextDouble(); //leia(valor1)
		
		
		System.out.println("Digite o valor 2:");
		valor2 = ler.nextDouble(); //leia(nota2)
		
		soma = (valor1+valor2); //cálculo da soma
		System.out.println("Sua soma é:  "+ soma);
		ler.close();
	}

}
