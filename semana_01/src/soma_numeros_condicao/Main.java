package soma_numeros_condicao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Solicite n�meros do usu�rio at� que ele insira o n�mero zero e, no final, exiba a soma de todos os n�meros fornecidos.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int numero = scan.nextInt();
		int soma = 0;
		
		while(numero != 0) {
			soma = soma+numero;
			System.out.println("Digite outro numero: ");
			numero = scan.nextInt();
		}
		scan.close();
		System.out.println("A soma dos numeros digitados: ");
		System.out.println(soma);

	}

}
