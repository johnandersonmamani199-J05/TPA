package prjListaApostila;
import java.util.Scanner;
	//Prj 24062025
public class MediaAluno {
    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        
        double nota1, nota2, media, exame, novaMedia;

        System.out.print("Digite a primeira nota: ");
        nota1 = in.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = in.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media < 3) {
            System.out.println("REPROVADO com média " + media);
        } else if (media >= 6) {
            System.out.println("APROVADO com média " + media);
        } else {
            System.out.println("EXAME - média atual: " + media);
            System.out.print("Digite a nota do exame: ");
            exame = in.nextDouble();
            novaMedia = (media + exame) / 2;

            if (novaMedia >= 6) {
                System.out.println("APROVADO com nova média: " + novaMedia);
            } else {
                System.out.println("REPROVADO com nova média: " + novaMedia);
         in.close();
            }
        }
    }
}