package prj26082025;
import java.util.Scanner;
public class MediaInfinita {
    public static void main(String[] args) {
    	int i=2;
    	double n1, n2, media;
    	Scanner in = new Scanner(System.in);
    	do {
    		System.out.println("Entre com a nota 1:");
    		n1 = in.nextDouble();
    		System.out.println("Entre com a nota 2:");
    		n2 = in.nextDouble();
    		media = (n1+n2)/2;
    		System.out.println("Media = "+media);
    		System.out.println("Deseja continuar? 1-Sim / 2-Não");
    		i=in.nextInt();
    		} while(i==1);
    	in.close();
    }
}