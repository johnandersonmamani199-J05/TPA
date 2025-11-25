package prj05082025;
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

        double p1 = f1 * 100.0 / total;
        double p2 = f2 * 100.0 / total;
        double p3 = f3 * 100.0 / total;
        double p4 = f4 * 100.0 / total;
        double p5 = f5 * 100.0 / total;

        System.out.println("Resultados:");
        System.out.printf("Faixa 1:",f1, "pessoas - %.2f%%\n", p1);
        System.out.printf("Faixa 2: %d pessoas - %.2f%%\n", f2, p2);
        System.out.printf("Faixa 3: %d pessoas - %.2f%%\n", f3, p3);
        System.out.printf("Faixa 4: %d pessoas - %.2f%%\n", f4, p4);
        System.out.printf("Faixa 5: %d pessoas - %.2f%%\n", f5, p5);

        in.close();
    }
}
