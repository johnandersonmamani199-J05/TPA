package prj02092025;
import java.util.Scanner;

public class Crescimento {
	public static void main(String[] args) {
		double joao = 1.34, pedro = 1.45;
	    int anos = 0;

	     do {
	    	 joao = joao + 0.025;

	         pedro = pedro + 0.020;

	         anos = anos + 1;

	     } while (joao <= pedro);

	     System.out.println("João ficará mais alto que Pedro em " + anos + " anos.");
	}
}
