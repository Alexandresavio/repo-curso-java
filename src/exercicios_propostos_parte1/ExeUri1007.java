package exercicios_propostos_parte1;

import java.util.Scanner;

public class ExeUri1007 {

	public static void main(String[] args) {
		/*
		 * Leia quatro valores inteiros A, B, C e D. A seguir, calcule
		 * e mostre a diferença do produto de A e B pelo produto de C 
		 * e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		 * 
		 * Entrada
		 * O arquivo de entrada contém 4 valores inteiros.
		 * 
		 * Saída
		 * Imprima a mensagem DIFERENCA com todas as letras maiúsculas.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de A:");
		int a = sc.nextInt();
		System.out.println("Digite o valor de B:");
		int b = sc.nextInt();
		System.out.println("Digite o valor de C:");
		int c = sc.nextInt();
		System.out.println("Digite o valor de D:");
		int d = sc.nextInt();
		
		int diferenca = (a * b - c * d);
		System.out.println("DIFERENCA = "+diferenca);
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
