package prjListaApostila;
import java.util.Scanner;

public class IRPF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salario, irpf = 0;

        System.out.print("Digite o salário: ");
        salario = in.nextDouble();

        if (salario <= 1434.59) {
            irpf = 0;
        } else if (salario <= 2150.00) {
            irpf = salario * 0.075 - 107.59;
        } else if (salario <= 2866.70) {
            irpf = salario * 0.15 - 268.84;
        } else if (salario <= 3582.00) {
            irpf = salario * 0.225 - 483.84;
        } else {
            irpf = salario * 0.275 - 662.94;
        }

        System.out.printf("Desconto IRPF: R$ %.2f\n", irpf);
    }
}
