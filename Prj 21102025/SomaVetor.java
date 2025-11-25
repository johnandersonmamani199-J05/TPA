package prj21102025;
import java.util.Scanner;

public class SomaVetor {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];
        int i;

        System.out.println("Digite os valores de A:");
        for (i = 0; i < 10; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = in.nextInt();
        }

        System.out.println("\nDigite os valores de B:");
        for (i = 0; i < 10; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = in.nextInt();
        }

        for (i = 0; i < 10; i++) {
            C[i] = A[i] + B[i];
        }

        System.out.println("\nVetor C (somando A + B):");
        for (i = 0; i < 10; i++) {
            System.out.print(C[i] + " ");
        }
	}

}
