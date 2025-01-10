package verifica_categoria_atleta;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Verifica��o de Categorias de um Atleta
			Escreva um programa que leia a idade de um atleta e classifique-o em uma das seguintes categorias:

			Infantil A: 5 a 7 anos
			Infantil B: 8 a 10 anos
			Juvenil A: 11 a 13 anos
			Juvenil B: 14 a 17 anos
			Adulto: 18 anos ou mais
			Caso a idade seja inferior a 5 anos, exiba a mensagem "Idade insuficiente para classifica��o".
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe idade:");
		int idade = scan.nextInt();
		scan.close();
		
		if(idade>= 5 && idade<=7) {
			System.out.println("Categoria: Infantil A");
		} else if(idade>=8 && idade<=10) {
			System.out.println("Categoria: Infantil B");
		} else if(idade>=11 && idade<=13) {
			System.out.println("Categoria: Juvenil A");
		} else if(idade>=14 && idade<=17) {
			System.out.println("Categoria: Juvenil B");
		} else if(idade>=18) {
			System.out.println("Categoria: Adulto");
		} else {
			System.out.println("Idade insuficiente para classifica��o");
		}

	}

}
