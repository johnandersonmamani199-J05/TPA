package prjAula04;
import java.util.Scanner;

public class ClassificacaoIdade {
	public static void main(String args[]) {

		Scanner in = new Scanner (System.in);
		
		int nasc, atual, idade;
		
		System.out.println("Digite o ano do seu nascimento:");
		nasc = (int) in.nextDouble(); //leia(nasc)
		
		System.out.println("Digite o ano atual:");
		atual = (int) in.nextDouble(); //leia(atual)
		
		idade = (atual-nasc); //cálculo da idade
		
		if (idade<10) {
			System.out.println("Criança");
		}else if(idade<18) {
			System.out.println("Adolecente");
		}else if(idade<60) {
			System.out.println("Adulto");
		}else{
			System.out.println("Idoso");
			}
		}
	}

