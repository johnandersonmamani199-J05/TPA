package prj05082025;
import java.util.Scanner;

public class asteroides {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			int t, v;
			
			t = in.nextInt();
			v = in.nextInt();

			
			if(t>1000 && v>20){
				System.out.println("GRANDE-RAPIDO");
			}
			if(t>1000 && v<=20){
				System.out.println("GRANDE-LENTO");
			}
			if(t<500 && v>20){
				System.out.println("PEQUENO-RAPIDO");
			}
			if(t<500 && v<=20){
				System.out.println("PEQUENO-LENTO");
			}	
			if(t>=500 && t<=1000 && v>20){
				System.out.println("MEDIO-RAPIDO");
			}
			if(t>=500 && t<=1000 && v<=20){
				System.out.println("MEDIO-LENTO");
			}
	}
}
