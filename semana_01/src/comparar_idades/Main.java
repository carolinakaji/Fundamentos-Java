package comparar_idades;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Exerc�cio 2: Compara��o de Idades
		 * Crie um programa que receba duas idades e diga:
		 * - Quem � mais velho.
		 * - Se as idades s�o iguais.
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite as idades:");
		int idade1 = scan.nextInt();
		int idade2 = scan.nextInt();
		scan.close();
		
		if(idade1 > idade2) {
			System.out.println(idade1 + " is higher than "+ idade2);
		} else if(idade1 == idade2){
			System.out.println(idade1 + " is equal to "+ idade2);
		} else {
			System.out.println(idade2 + " is higher than "+ idade1);
		}
		

	}

}
