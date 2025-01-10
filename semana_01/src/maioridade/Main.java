package maioridade;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Verifique se uma pessoa é maior de idade com base na idade fornecida.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma idade:");
		int idade = scan.nextInt();
		scan.close();
		
		if(idade >= 18) {
			System.out.println("Sim, você é maior de idade");
		} else {
			System.out.println("Não, você não é maior de idade");
		}

	}

}
