package prjListaApostila;
import java.util.Scanner;
	//Prj 24062025
public class CalculoIMC {
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);

        double peso, altura, imc;

        System.out.print("Digite o peso (kg): ");
        peso = in.nextDouble();

        System.out.print("Digite a altura (m): ");
        altura = in.nextDouble();

        imc = peso / (altura * altura);
		System.out.println("Seu IMC é "+ imc);

        if (imc < 18.5) {
			System.out.println("Excesso de Magreza");
        } else if (imc < 25) {
        	System.out.println("Peso Normal");
        } else if (imc < 30) {
        	System.out.println("Excesso de Peso");
        } else if (imc < 35) {
        	System.out.println("Obesidade (Grau I)");
        } else if (imc < 40) {
        	System.out.println("Obesidade (Grau II)");
        } else {
        	System.out.println("Obesidade (Grau III)");
        }
   	}
}
