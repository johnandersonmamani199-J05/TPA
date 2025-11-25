package prj21102025;
import java.util.Scanner;

public class InversoVetor {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];
        int i=0, j=9;

        for (i = 0; i < 10; i++) {
            System.out.print("Digite A[" + i + "]: ");
            A[i] = in.nextInt();
        }

        for (i = 0; i < 10; i++) {
            B[i] = A[j];
            j--;
        }

        System.out.println("\nVetor B (invertido):");
        for (i = 0; i < 10; i++) {
            System.out.print(B[i] + " ");
        }
	}
}
