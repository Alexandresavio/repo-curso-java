package exercicios_propostos_parte1;

import java.util.Scanner;

public class ExeUri1010 {

	public static void main(String[] args) {
	 /*
	  * Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, 
	  * o valor unitário de cada peça 1, o código de uma peça 2, o número de peças
	  * 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
	  * 
	  * Entrada
	  * O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores,
	  * respectivamente dois inteiros e um valor com 2 casas decimais.
	  * 
	  * Saída
	  * A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de 
	  * deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá ser 
	  * apresentado com 2 casas após o ponto.
	  * 
	  * 
	  */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o código da 1ª peça");
		int cod1 = sc.nextInt();
		System.out.println("Informe a quantidade de peça:");
		int quantidadecod1 = sc.nextInt();
		System.out.println("Informe o valor de peça:");
		double valorCod1 = sc.nextDouble();
		
		System.out.println("Informe o código da 2ª peça:");
		int cod2 = sc.nextInt();
		System.out.println("Informe a quantidade de peça:");
		int quantidadecod2 = sc.nextInt();
		System.out.println("Informe o valor de peça:");
		double valorCod2 = sc.nextDouble();
		
		double valorTotal = (quantidadecod1 * valorCod1)+(quantidadecod2 * valorCod2);
		
		System.out.printf("QUANTIDADE PEÇA CODIGO %d :%d\n",cod1, quantidadecod1);
		System.out.printf("QUANTIDADE PEÇA CODIGO %d :%d\n",cod2, quantidadecod2);
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);
		
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
