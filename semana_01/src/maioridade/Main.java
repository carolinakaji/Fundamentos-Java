package maioridade;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Verifique se uma pessoa � maior de idade com base na idade fornecida.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma idade:");
		int idade = scan.nextInt();
		scan.close();
		
		if(idade >= 18) {
			System.out.println("Sim, voc� � maior de idade");
		} else {
			System.out.println("N�o, voc� n�o � maior de idade");
		}

	}

}
