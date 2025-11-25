package prj21102025;
import java.util.Scanner;

public class Quadradro {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];
        int i;

        for (i = 0; i < 10; i++) {
            System.out.print("Digite A[" + i + "]: ");
            A[i] = in.nextInt();
            B[i] = A[i] * A[i];
        }

        System.out.println("\nVetor B (quadrados):");
        for (i = 0; i < 10; i++) {
            System.out.print(B[i] + " ");
        }
	}
}
