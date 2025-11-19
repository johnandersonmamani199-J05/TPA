package prj04112025;
import java.util.Scanner;

public class RegraFormacao {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		    int A[] = new int[10];
		    int B[] = new int[10];

		    for (int i = 0; i < 10; i++) {
		        System.out.print("A[" + (i+1) + "] = ");
		        A[i] = in.nextInt();

		        if (A[i] % 2 == 0)
		        	B[i] = 1;
		        else
		        	B[i] = 0;
		    }

		    System.out.print("B = [ ");
		    for (int i = 0; i < 10; i++) {
		        System.out.print(B[i] + " ");
		    }
		        System.out.println("]");
		        in.close();
	}
}
