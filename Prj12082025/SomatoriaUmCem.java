package prj19082025;
import java.util.Scanner;

public class SomatoriaUmCem {
    public static void main(String[] args) {
        int soma = 0;
        int i = 1;

        while (i <= 100) {
            soma += i;
            i++;
        }

        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }
}
