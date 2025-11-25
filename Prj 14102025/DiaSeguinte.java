package prj14102025;
import java.util.Scanner;

public class DiaSeguinte {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int dia, mes, ano;
		int i=1;
		
		System.out.println("Digite o dia atual:");
		dia = in.nextInt();
		
		System.out.println("Digite o mês atual:");
		mes = in.nextInt();
		
		System.out.println("Digite o ano atual:");
		ano = in.nextInt();
		
		switch(mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (dia == 31) {
				mes = mes+1;
				dia = 1;
			}else {
				if (dia>31) {
					System.out.println("Dia inv�lido");
				}else {
					dia = dia+1;
				}
			}
			break;
		case 2:
			if (ano%4==0) {
				if (dia == 29) {
					mes = mes+1;
					dia = 1;
				}else {
					if (dia>29) {
						System.out.println("Dia inv�lido");
					}else {
						dia = dia+1;
					}
				}
			}else{
				if (dia == 28) {
				mes = mes+1;
			}else{
				if (dia>28) {
					System.out.println("Dia inv�lido");
				}else{
					dia = dia+1;
			}
			}
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (dia == 30) {
				mes = mes+1;
				dia = 1;
			}else {
				if (dia>30) {
					System.out.println("Dia inv�lido");
				}else {
					dia = dia+1;
				}
			}
			break;
		default:
			System.out.println("M�s inv�lido");
		}
		if (mes == 13 && dia == 1){
			ano = ano + 1;
			mes = 1;
		}
		System.out.println("Dia seguinte: " +dia);
		System.out.println("M�s seguinte: " +mes);
		System.out.println("Ano seguinte: " +ano);
	}
}
