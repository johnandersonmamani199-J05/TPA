package prj21102025;
import java.util.Scanner;

public class MediaVetor {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] A = new int[10];
        int soma = 0;
        double media;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite A[" + i + "]: ");
            A[i] = in.nextInt();
            soma = soma + A[i];
        }

        media = soma / 10.0;

        System.out.println("\nMédia dos 10 valores = " + media);
	}
}
