package taxa_juros_base_pontuacao_credito;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * **Determina��o de Taxa de Juros com Base na Pontua��o de Cr�dito**
		 * Implemente um programa que calcule a taxa de juros com base na pontua��o de cr�dito:
		 * - Pontua��o >= 800: Taxa de juros 1.5%
		 * - Pontua��o >= 700 e < 800: Taxa de juros 2.0%
		 * - Pontua��o >= 600 e < 700: Taxa de juros 3.5%
		 * - Pontua��o < 600: Empr�stimo negado.
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe sua pontuacao de credito:");
		int pontuacaoCredito = scan.nextInt();
		
		if(pontuacaoCredito >= 800) {
			System.out.println("Taxa de juros 1.5%");
		} else if(pontuacaoCredito >= 700 && pontuacaoCredito < 800) {
			System.out.println("Taxa de juros 2.0%");
		} else if(pontuacaoCredito >= 600 && pontuacaoCredito < 700) {
			System.out.println("Taxa de juros 3.5%");
		} else if(pontuacaoCredito < 600) {
			System.out.println("Emprestimo negado. Pontuacao baixa");
		}
		
		scan.close();
	}

}
