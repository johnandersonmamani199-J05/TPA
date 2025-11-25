package prj05082025;
import java.util.Scanner;

public class NumerosPares {
	public static void main(String[] args) {
		int i = 1;

		do {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}while(i <= 500);
	}
}
