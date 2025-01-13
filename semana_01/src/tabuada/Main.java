package tabuada;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Exiba a tabuada de um número fornecido pelo usuário.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero de 1 a 10 para saber a tabuada: ");
		int tabuada = scan.nextInt();
		scan.close();
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(tabuada + " x " + i + " = " + tabuada*i);
		}

	}

}
