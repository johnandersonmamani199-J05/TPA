package prj26082025;
import java.util.Scanner;

public class Potencia {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base, expoente, resultado, i;
        
        System.out.print("Digite a base: ");
        base = in.nextInt();

        System.out.print("Digite o expoente: ");
        expoente = in.nextInt();

        resultado = 1;
        i = 1;

        do {
            resultado *= base;
            i++;
        } while (i <= expoente);

        System.out.println("Resultado = " + resultado);

        in.close();
    }
}
