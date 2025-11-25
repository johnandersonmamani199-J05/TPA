package prjAula02;
import java.util.Scanner;

public class volume {
	public static void main(String[] args) {
		
		//criando um scarnner chamado ler
		Scanner ler = new Scanner(System.in);

		double raio, altura, volume;
		
		System.out.println("Digite o valor 3,16:")
		raio = ler.nextDouble(); //leia(raio)
		
		System.out.println("Digite o valor 1:")
		altura = ler.nextDouble(); //leia(altura)
		
		volume = (3,16*(raio*raio)*altura); //cálculo do volume
		System.out.println("Seu volume é:  "+ volume +"³");
		ler.close();
		
	}
}
