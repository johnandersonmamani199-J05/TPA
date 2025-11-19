package prj04112025;
import java.util.Scanner;

public class RegraFormacaoDoisVetores {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int A[] = new int[10];
        int B[] = new int[10];
        int C[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + (i+1) + "] = ");
            A[i] = in.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("B[" + (i+1) + "] = ");
            B[i] = in.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (A[i] > B[i])
                C[i] = 1;
            else if (A[i] == B[i])
                C[i] = 0;
            else
                C[i] = -1;
        }
        System.out.print("C = [ ");
        for (int i = 0; i < 10; i++) {
            System.out.print(C[i] + " ");
        }
        System.out.println("]");

	}
}
