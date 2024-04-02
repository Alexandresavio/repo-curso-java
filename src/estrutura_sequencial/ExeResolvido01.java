package estrutura_sequencial;

import java.util.Scanner;

public class ExeResolvido01 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler as medidas da largura e comprimento de um terreno
		 * retangular com uma casa decimal, bem como o valor do metro quadrado do terreno
		 * com duas casas decimais. Em seguida, o programa deve mostrar o valor da área do
		 * terreno, bem como o valor do preço do terreno, ambos com duas casas decimais,conforme exemplo.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Largura do terreno:");
		double larguraT = sc.nextDouble();
		System.out.println("Comprimento do terreno:");
		double comprimentoT = sc.nextDouble();
    	System.out.println("Valor mt2:");
		double valorM2 = sc.nextDouble();
		
		double areaT = comprimentoT * larguraT;
		double valorT = areaT * valorM2;
		System.out.printf("AREA = %.2f\n",areaT);
		System.out.printf("PREÇO = R$ %.2f\n",valorT);
		
		
		
		sc.close();
		
		

	}

}
