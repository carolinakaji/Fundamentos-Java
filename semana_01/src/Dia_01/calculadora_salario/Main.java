package Dia_01.calculadora_salario;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * 	Exercício 4: Calculadora de Salário

			Receba o salário base de uma pessoa e mostre:

			- Salário com aumento de 10%.
			- Salário com desconto de 5%.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu salario: ");
		int salario = scan.nextInt();
		
		double aumento = salario*(1+0.1);
		double desconto = salario*(1-0.05);
		scan.close();
		
		System.out.println("Salario com aumento: " + aumento);
		System.out.println("Salario com desconto: " + desconto);

	}

}
