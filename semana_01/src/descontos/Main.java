package descontos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Crie um programa para calcular o desconto de um produto com base em um código (exemplo: código 1 = 10%, código 2 = 20%).
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o codigo 1 ou 2 para aplicar o desconto no valor da compra de R$823,33");
		int codigo = scan.nextInt();
		scan.close();
		double valorTotal = 823.33;
		double valorTotalDesconto;
		
		switch (codigo) {
		case 1:
			valorTotalDesconto = valorTotal*(1-0.10);
			break;
		case 2:
		valorTotalDesconto = valorTotal*(1-0.20);
		break;
		default:
			valorTotalDesconto = valorTotal;
		}
		
		System.out.println("O valor com o codigo selecionado eh:" +  String.format("%.2f", valorTotalDesconto));
		
	
	}

}
