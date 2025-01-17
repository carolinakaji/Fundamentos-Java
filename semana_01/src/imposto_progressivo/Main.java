package imposto_progressivo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * **C�lculo de Imposto Progressivo**
		 * 
		 * Crie um programa que calcule o imposto de renda baseado no sal�rio anual informado pelo usu�rio. Utilize as seguintes regras:
		 * - At� R$ 28.559,70: Isento
		 * - De R$ 28.559,71 a R$ 46.750,00: 15%
		 * - Acima de R$ 46.750,00: 27,5%
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o salario anual: ");
		double salarioAnualInformado = scan.nextDouble();
		double impostoRetido = 0;
		scan.close();

		if(salarioAnualInformado >= 28559.71 && salarioAnualInformado<=46750.00) {
			impostoRetido = salarioAnualInformado*0.15;
		} else if(salarioAnualInformado > 46750.00) {
			impostoRetido =salarioAnualInformado*0.275;
		} else if(salarioAnualInformado <=28559.70) {
			impostoRetido = 0;
		}
		
		System.out.println("Com base no seu salario, o imposto eh: R$" + String.format("%.2f", impostoRetido));
	}

}
