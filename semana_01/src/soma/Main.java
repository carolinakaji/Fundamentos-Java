package soma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*  Exerc�cio 1: Opera��es Matem�ticas
			Escreva um programa que receba dois n�meros inteiros do usu�rio e mostre:

			- A soma, subtra��o, multiplica��o, divis�o e o resto da divis�o entre eles.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int soma = a + b;

		int subtracao = a - b;
		int multiplicacao = a * b;
		int divisao = a / b;
		int resto = a%b;
		scan.close();
		
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtra��o: " + subtracao);
		System.out.println("Multiplica��o: " + multiplicacao);
		System.out.println("Divisao:" + divisao);
		System.out.println("Resto: "+ resto);
		
		
	}

}
