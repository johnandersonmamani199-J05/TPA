package prj04112025;
import java.util.Scanner;

public class ParesImpares {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int[] a = new int[20];
        int[] b = new int[20];
        int i, j = 0;

        for (i = 0; i < 20; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            a[i] = in.nextInt();
        }

        for (i = 0; i < 20; i++) {
            if (a[i] % 2 == 0) {
                b[j] = a[i];
                j++;
            }
        }
        for (i = 0; i < 20; i++) {
            if (a[i] % 2 != 0) {
                b[j] = a[i];
                j++;
            }
        }

        System.out.print("Vetor B = [ ");
        for (i = 0; i < 20; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println("]");
        in.close();
	}
}
