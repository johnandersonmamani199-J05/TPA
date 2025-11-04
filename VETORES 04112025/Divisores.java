package prj04112025;
import java.util.Scanner;

public class Divisores {
	public static void main(String[] args) {
	       Scanner in = new Scanner(System.in);
	        int A[] = new int[10];

	        for (int i = 0; i < 10; i++) {
	            System.out.print("Digite o " + (i + 1) + "º número: ");
	            A[i] = in.nextInt();
	        }

	        for (int i = 0; i < 10; i++) {
	            System.out.print("Divisores de " + A[i] + ": ");
	            for (int j = 1; j <= A[i]; j++) {
	                if (A[i] % j == 0) {
	                    System.out.print(j + " ");
	                }
	            }
	            System.out.println();
	        }
	        in.close();
	}
}
