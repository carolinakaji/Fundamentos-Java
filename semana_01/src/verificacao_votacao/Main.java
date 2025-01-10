package verificacao_votacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * ### **Exerc�cio 3: Verifica��o de Vota��o**

			Pe�a ao usu�rio para inserir sua idade. O programa deve informar:

			- Se ele � menor de idade (n�o pode votar).
			- Se pode votar opcionalmente (16 ou 17 anos).
			- Se o voto � obrigat�rio (18 anos ou mais).
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
