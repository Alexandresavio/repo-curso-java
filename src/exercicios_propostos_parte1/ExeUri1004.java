package exercicios_propostos_parte1;

import java.util.Scanner;

public class ExeUri1004 {

	public static void main(String[] args) {
		
		/*  Leia dois valores inteiros. A seguir, calcule o produto entre estes dois
		 *  valores e atribua esta operação à variável PROD. A seguir mostre a variável
		 *  PROD com mensagem correspondente.
		 *  
		 *  Entrada
		 *  O arquivo de entrada contém 2 valores inteiros.
		 *  
		 *  Saída
		 *  Imprima a mensagem "PROD" e a variável PROD conforme exemplo abaixo, com um
		 *  espaço em branco antes e depois da igualdade. 
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de A:");
		int a = sc.nextInt();
		System.out.println("Digite o valor de B:");
		int b = sc.nextInt();
		int prod = a * b;
		System.out.println("PROD = "+prod);
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
