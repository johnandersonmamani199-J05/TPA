package prj26082025;
import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int i = 1, n;
		int f=1;
		System.out.println("Digite o número:");
		n = in.nextInt();
		do {
			f = f*i;
			i++;
		}while(i<=n);
		System.out.println(f);

	}
}
