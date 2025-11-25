package prjListaApostila;
import java.util.Scanner;
	//Prj 24062025
public class TipoTriângulo {
public static void main(String[] args) {
	
		Scanner in = new Scanner (System.in);

        double a, b, c;

        System.out.print("Lado A: ");
        a = in.nextDouble();
        System.out.print("Lado B: ");
        b = in.nextDouble();
        System.out.print("Lado C: ");
        c = in.nextDouble();

        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero");
            } else if (a != b && b != c && a != c) {
                System.out.println("Triângulo Escaleno");
            } else {
                System.out.println("Triângulo Isósceles");
            }
        } else {
            System.out.println("Não é um triângulo.");
        }
    }
}

