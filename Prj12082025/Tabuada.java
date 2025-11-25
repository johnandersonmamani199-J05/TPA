package prj19082025;
import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	        System.out.print("Digite um número: ");
	        int N = sc.nextInt();

	        int i = 1;
	        while (i <= 10) {
	            int resultado = N * i;
	            System.out.println(N + " x " + i + " = " + resultado);
	            i++;
	        }
	        sc.close();
	}

}
