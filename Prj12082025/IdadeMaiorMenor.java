package prj19082025;
import java.util.Scanner;

public class IdadeMaiorMenor {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maiores = 0, menores = 0;
        int i = 1;

        while (i <= 5) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = sc.nextInt();

            if (idade >= 18) {
                maiores++;
            } else {
                menores++;
            }

            i++;
        }

        System.out.println("Maiores de idade: " + maiores);
        System.out.println("Menores de idade: " + menores);

        sc.close();
	}
}
