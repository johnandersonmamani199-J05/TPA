package prj09092025;
import java.util.Scanner;

public class InformacoesPessoa {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int contIdade50 = 0, contAltura = 0, contPeso40 = 0;
        int maisVelho = 0, maisNovo = 999;
        double somaAltura = 0;

        for (int i = 1; i <= 25; i++) {
            System.out.println("Pessoa " + i + ":");
            System.out.print("Idade: ");
            int idade = in.nextInt();
            System.out.print("Altura (m): ");
            double altura = in.nextDouble();
            System.out.print("Peso (kg): ");
            double peso = in.nextDouble();

            if (idade > 50) contIdade50++;

            if (idade >= 10 && idade <= 20) {
                somaAltura += altura;
                contAltura++;
            }

            if (peso < 40) contPeso40++;

            if (idade > maisVelho) maisVelho = idade;
            if (idade < maisNovo) maisNovo = idade;

            System.out.println("--------------------------");
        }

        double mediaAltura = (contAltura > 0) ? somaAltura / contAltura : 0;
        double porcPeso = (contPeso40 / 25.0) * 100;

        System.out.println("Quantidade com idade > 50: " + contIdade50);
        System.out.println("Média das alturas (10-20 anos): " + mediaAltura);
        System.out.println("Porcentagem peso < 40kg: " + porcPeso + "%");
        System.out.println("Mais velho: " + maisVelho);
        System.out.println("Mais novo: " + maisNovo);

        in.close();
    }
}
