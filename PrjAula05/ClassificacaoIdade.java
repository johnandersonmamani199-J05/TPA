package prjListaApostila;
import java.util.Scanner;
	//Prj 24062025
public class ClassificacaoIdade {
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int nasc, atual, idade;
		char classe;
		
		System.out.println("Digite o ano do seu nascimento:");
		nasc = (int) in.nextDouble(); //leia(nasc)
		
		System.out.println("Digite o ano atual:");
		atual = (int) in.nextDouble(); //leia(atual)
		
		idade = (atual-nasc); //cálculo da idade
		
		if (idade<10) {
			System.out.println("Criança com "+ idade + "anos");
		}else if(idade<18) {
			System.out.println("Adolecente com "+ idade +"anos");
		}else if(idade<60) {
			System.out.println("Adulto com "+ idade +"anos");
		}else{
			System.out.println("Idoso com "+ idade +" anos");
			}
		}
	}

