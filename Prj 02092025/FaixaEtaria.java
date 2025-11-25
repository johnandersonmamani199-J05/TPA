package prj02092025;
import java.text.DecimalFormat;
import java.util.Scanner;

public class FaixaEtaria {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int idade, opcao;
        int f1 = 0, f2 = 0, f3 = 0, f4 = 0, f5 = 0;
        int total = 0;

        do {
            System.out.print("Digite a idade: ");
            idade = in.nextInt();

            if (idade <= 15) {
                f1++;
            } else if (idade <= 30) {
                f2++;
            } else if (idade <= 45) {
                f3++;
            } else if (idade <= 60) {
                f4++;
            } else {
                f5++;
            }

            total++;

            System.out.print("Deseja continuar? (1-Sim / 2-Não): ");
            opcao = in.nextInt();

        } while (opcao == 1);

        DecimalFormat df = new DecimalFormat("0.00");

        double p1 = f1 * 100.0 / total;
        double p2 = f2 * 100.0 / total;
        double p3 = f3 * 100.0 / total;
        double p4 = f4 * 100.0 / total;
        double p5 = f5 * 100.0 / total;

        System.out.println("\n===== RESULTADOS =====");
        System.out.println("Até 15 anos: " + f1 + " pessoas (" + df.format(p1) + "%)");
        System.out.println("De 16 a 30 anos: " + f2 + " pessoas (" + df.format(p2) + "%)");
        System.out.println("De 31 a 45 anos: " + f3 + " pessoas (" + df.format(p3) + "%)");
        System.out.println("De 46 a 60 anos: " + f4 + " pessoas (" + df.format(p4) + "%)");
        System.out.println("Acima de 61 anos: " + f5 + " pessoas (" + df.format(p5) + "%)");
        in.close();
	}
}
