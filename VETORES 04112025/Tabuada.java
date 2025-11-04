package prj04112025;
import java.util.Scanner;
public class Tabuada {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int[] a = new int[5];
	        int i, j;

	        for (i = 0; i < 5; i++) {
	            System.out.print("Digite o " + (i + 1) + "º número: ");
	            a[i] = in.nextInt();
	        }

	        for (i = 0; i < 5; i++) {
	            System.out.println("\nTabuada do " + a[i] + ":");
	            for (j = 1; j <= 10; j++) {
	                System.out.println(a[i] + " x " + j + " = " + (a[i] * j));
	            }
	        }
	    in.close();
	}
}
