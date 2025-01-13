package senha_correta;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Faça um programa que solicita a senha de um usuário e só termina quando a senha correta for digitada.
		
		Scanner scan = new Scanner(System.in);
		String senhaOriginal = "1231";
		String senhaDigitada;
		do {
			System.out.println("Digite a senha: ");
			senhaDigitada = scan.nextLine();
		} while(!senhaDigitada.equals(senhaOriginal));
		
		scan.close();
	}

}
