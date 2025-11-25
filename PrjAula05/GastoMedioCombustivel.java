package prjListaApostila;
import java.util.Scanner;
	//Prj 24062025
public class GastoMedioCombustivel {
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);

		double distancia, litros, consumo;

	        System.out.print("Digite a distância percorrida (km): ");
	        distancia = in.nextDouble();

	        System.out.print("Digite a capacidade do tanque (litros): ");
	        litros = in.nextDouble();

	        consumo = distancia / litros;
	        System.out.printf("Consumo médio:" + consumo+" litros ");
	        
	        if (consumo >= 10) {
	            System.out.println("Econômico");
	        } else {
	            System.out.println("Não econômico");
	        }
	    }
	}
