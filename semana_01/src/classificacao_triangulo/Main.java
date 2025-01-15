package classificacao_triangulo;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	/*
	 * Escreva um programa que leia os comprimentos de três lados e determine se eles podem formar um triângulo. Se sim, classifique o triângulo como:
	 * - Equilátero: todos os lados iguais
	 * - Isósceles: dois lados iguais
	 * - Escaleno: todos os lados diferentes
	 * Caso não forme um triângulo, exiba "Não é um triângulo".
	 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o comprimento do lado A do trangulo:");
		int ladoA = scan.nextInt();
		System.out.println("Digite o comprimento do lado B do trangulo:");
		int ladoB = scan.nextInt();
		System.out.println("Digite o comprimento do lado C do trangulo:");
		int ladoC = scan.nextInt();
		
		if (ladoA == 0 || ladoB ==0 || ladoC == 0){
			System.out.println("Nao eh triangulo");
		} else if(ladoA == ladoB && ladoA==ladoC) {
			System.out.println("Triangulo Equilatero");
		} else if((ladoA == ladoB && ladoA != ladoC)|| (ladoA == ladoC&& ladoA != ladoB) || (ladoB == ladoC && ladoB != ladoA)) {
			System.out.println("Triangulo Isoceles");
		} else if(ladoA != ladoB && ladoA != ladoC) {
			System.out.println("Triangulo Escaleno");
		} 
		
	}
}
