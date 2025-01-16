package verifica_elegibilidade_emprestimo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 *  **Verificação de Elegibilidade para Empréstimo**

			Crie um programa que leia a idade, a renda mensal e a pontuação de crédito de um cliente. O programa deve determinar se ele é elegível para um empréstimo com base nas seguintes condições:

			- A idade deve ser entre 18 e 65 anos.
			- A renda mensal mínima deve ser de R$ 2.000.
			- A pontuação de crédito deve ser maior ou igual a 700.

			Exiba mensagens apropriadas para cada condição não atendida.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Digita sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Digita sua renda mensal: ");
		double rendaMensal = scan.nextDouble();
		System.out.println("Digita sua pontuacao de credito: ");
		int pontuacaoCredito = scan.nextInt();
		int cont = 0;
		
		scan.close();
		
		if(idade < 18 || idade > 65) {
			System.out.println("Nao eh possivel realizar emprestimo devido a idade nao estar entre 18 e 65 anos.");
		} else {
			cont = 1;
		}
		if(rendaMensal < 2000) {
			System.out.println("Sua renda mensal nao antende aos criterios para realizar emrpestimo");
		} else {
			cont = cont+ 1;
		}
		if(pontuacaoCredito < 700) {
			System.out.println("Sua pontuacao de credito esta abaixo de 700, portanto nao atende aos criterios para realizar emprestimo");
		} else {
			cont = cont+ 1;
		}
		
		if (cont==3) {
			System.out.println("Voce eh elegivel para fazer emprestimo");
		}
		
	}

}
