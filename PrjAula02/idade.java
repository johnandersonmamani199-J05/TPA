package prjAula02;
import java.util.Scanner;

public class idade {
	public static void main(String[] args) {

		//criando um scarnner chamado ler
		Scanner ler = new Scanner(System.in);

		int anoNasc, anoAtual, idade;
		
		System.out.println("Digite o valor 1:");
		anoNasc = (int) ler.nextDouble(); //leia(anoNasc)
		
		System.out.println("Digite o valor 1:");
		anoAtual = (int) ler.nextDouble(); //leia(anoatual)
		
		idade = (anoAtual-anoNasc); //cálculo da idade
		System.out.println("Sua idade é:  "+ idade +"anos");
		ler.close();
	}
}
