package prjListaApostilaPrjAula29072025;
import java.util.Scanner;

public class PorcentagemIdade {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double i1, i2, i3, i4, i5, maior, menor, porcMaior, porcMenor;
		
		maior = 0;
		menor = 0;
		
		System.out.println("Entre com a primeira idade");
		i1 = in.nextDouble();
		
		if (i1>=18) {
			maior = maior+1;
		} else {
			menor = menor+1;
		}
			
		System.out.println("Entre com a segunda idade");
		i2 = in.nextDouble();
			
		if (i2>=18) {
			maior = maior+1;
		} else {
			menor = menor+1;
		}
				
		System.out.println("Entre com a terceira idade");
		i3 = in.nextDouble();
				
		if (i3>=18) {
			maior = maior+1;
		} else {
		menor = menor+1;
		}
		System.out.println("Entre com a quarta idade");
		i4 = in.nextDouble();
			
		if (i4>=18) {
			maior = maior+1;
		} else {
			menor = menor+1;
		}
		
		System.out.println("Entre com a quinta idade");
		i5 = in.nextDouble();
		
		if (i5>=18) {
			maior = maior+1;
		} else {
			menor = menor+1;
		}
		
		porcMaior = (maior*100)/5;
		System.out.println("A porcentagem é:" +porcMaior+ "%");
		
		porcMenor = (menor*100)/5;
		System.out.println("A porcentagem é:" +porcMenor+ "%");
	}
}
