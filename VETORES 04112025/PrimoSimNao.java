package prj04112025;
import java.util.Scanner;

public class PrimoSimNao {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int A[] = new int[10];
        int i, j, cont;

        for (i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            A[i] = in.nextInt();
        }

        for (i = 0; i < 10; i++) {
            cont = 0;
            for (j = 1; j <= A[i]; j++) {
                if (A[i] % j == 0) {
                    cont++;
                }
            }
            if (cont == 2) {
                System.out.println(A[i] + " é primo");
            } else {
                System.out.println(A[i] + " não é primo");
            }
        }
        in.close();
	}
}
