package ordem_crescente;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * 1. **Desafio com operadores l�gicos:**
			- Fa�a um programa que receba 3 n�meros e verifique se eles est�o em ordem crescente.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 3 numeros:");
		

		
		int[] entrada = new int[3];
		for (int i = 0 ; i < entrada.length ; i++) {
			entrada[i] = scan.nextInt();
		}
		
		scan.close();
	
		for (int i = 0; i < entrada.length ; i++) {
			if(i < entrada.length-1 && entrada[i] > entrada[i+1]) {
				System.out.println("Nao esta em ordem");
				System.out.println(Arrays.toString(entrada));
			} else if(i == entrada.length - 1 && entrada[i]>= entrada[i-1]) {
				System.out.println("Esta em ordem");
				System.out.println(Arrays.toString(entrada));
			}
		}
		}

	}


