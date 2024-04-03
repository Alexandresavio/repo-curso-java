package estrutura_condicional;

import java.util.Scanner;

public class CondicionalEncadeada {

	public static void main(String[] args) {
		/*
		 *  if dentro de outro if
		 *  Exemplo:
		 *  Fazer um programa para ler três números inteiros.
		 *  Em seguida, mostrar qual o menor dentre os três números
		 *  lidos. Em caso de empate, mostrar apenas uma vez.
		 *  
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inform 3 números:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a < b && a < c) {
			System.out.println("MENOR = "+a);
		}else if(b < a && b < c) {
			System.out.println("MENOR = "+b);			
		}else if(c < a && c < b){
			System.out.println("MENOR = "+c);
		}else {
			System.out.println("Menor = "+a);
		}
		
		
		sc.close();
		
		
		
		

	}

}
