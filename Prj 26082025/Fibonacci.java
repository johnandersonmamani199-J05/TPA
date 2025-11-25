package prj26082025;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N, c;
        int a=1, b = 1, i=3;
        System.out.print("Digite o número de termos: ");
        
        N = in.nextInt();
        
        System.out.println(a);
        System.out.println(b);

        do {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
            i++;
        } while (i <= N);

        in.close();
	}
}
