package prj05082025;

public class Crescimento {
	public static void main(String[] args) {
		double joao = 1.34;
		double pedro = 1.45;
		int anos = 0;

		do {
			joao += 0.025; // cresce 2,5 cm
			pedro += 0.020; // cresce 2 cm
			anos++;
		}while(joao <= pedro);

		System.out.println("Anos necessários: " + anos);
	}
}
