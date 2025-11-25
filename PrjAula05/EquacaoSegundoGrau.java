package prjListaApostila;
import java.util.Scanner;
	//Prj 24062025
public class EquacaoSegundoGrau {
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
        double a, b, c, delta, x1, x2;

        System.out.print("Digite A: ");
        a = in.nextDouble();
        System.out.print("Digite B: ");
        b = in.nextDouble();
        System.out.print("Digite C: ");
        c = in.nextDouble();

        delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("Não existem raízes reais.");
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            System.out.printf("Existe uma raiz real:", x1);
        } else {
            x1 = (-b + (delta)) / (2 * a);
            x2 = (-b - (delta)) / (2 * a);
            System.out.printf("Duas raízes reais: x1 =" + x1+" , x2 = " + x2);
        }
    }
}
