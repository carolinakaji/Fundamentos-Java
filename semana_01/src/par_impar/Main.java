package par_impar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Crie um programa que leia um n�mero e verifique se ele � par ou �mpar.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro: ");
		int numero = scan.nextInt();
		scan.close();
		
		int resto = numero%2;
		
		if(resto == 0) {
			System.out.println("Numero " + numero + " � par");
		} else {
			System.out.println("Numero " + numero + " � �mpar");
		}

	}

}
