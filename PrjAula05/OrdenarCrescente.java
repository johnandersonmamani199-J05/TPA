package prjListaApostila;
import java.util.Scanner;
	//Prj 24062025
public class OrdenarCrescente {
	    public static void main(String[] args) {
	    	
	        Scanner in = new Scanner(System.in);
	        
	        int a, b, c, temp;

	        System.out.print("Digite A: ");
	        a = in.nextInt();
	        System.out.print("Digite B: ");
	        b = in.nextInt();
	        System.out.print("Digite C: ");
	        c = in.nextInt();

	        if (a > b) { temp = a; a = b; b = temp; }
	        if (a > c) { temp = a; a = c; c = temp; }
	        if (b > c) { temp = b; b = c; c = temp; }

	        System.out.println("Ordem crescente: " + a + ", " + b + ", " + c);
	    }
	}
