package verificacao_votacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * ### **Exercício 3: Verificação de Votação**

			Peça ao usuário para inserir sua idade. O programa deve informar:

			- Se ele é menor de idade (não pode votar).
			- Se pode votar opcionalmente (16 ou 17 anos).
			- Se o voto é obrigatório (18 anos ou mais).
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int idade = scan.nextInt();
		scan.close();
		
		if(idade < 16) {
			System.out.println("Com esta idade nao pode votar");
		} else if(16 >= idade || idade <= 17) {
			System.out.println("Voto eh opcional");
		} else {
			System.out.println("Voto eh obrigatorio");
		}

	}

}
