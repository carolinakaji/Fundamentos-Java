package validacao_corRGB;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que receba tr�s valores inteiros representando os valores de **R**, **G** e **B**. O programa deve verificar se esses valores formam uma cor v�lida no sistema RGB. As regras s�o:
		 * - Cada valor deve estar entre 0 e 255.
		 * Se v�lido, exiba "Cor v�lida". Caso contr�rio, exiba "Cor inv�lida".
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor entre 0 - 255 para R (red)");
		int red = scan.nextInt();
		System.out.println("Digite o valor entre 0 - 255 para G (green)");
		int green = scan.nextInt();
		System.out.println("Digite o valor entre 0 - 255 para B (blue)");
		int blue = scan.nextInt();
		scan.close();
		

		if (red<0 || red>255 || green<0 || green>255 || blue<0 || blue>255) {
			System.out.println("Cor invalida");
		} else {
			System.out.println("Cor valida");
		}
	}

}
