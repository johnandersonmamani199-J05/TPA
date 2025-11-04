package prj04112025;

public class Potencia {

	public static void main(String[] args) {
		int A[] = new int[11];
        int i;
        int valor = 1;

        for (i = 0; i < 11; i++) {
            A[i] = valor;
            valor = valor * 2;
        }

        System.out.print("Vetor A = [ ");
        for (i = 0; i < 11; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("]");
	}
}
