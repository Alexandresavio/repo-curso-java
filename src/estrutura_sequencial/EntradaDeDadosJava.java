package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDadosJava {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);// instanciação do objeto do tipo Scanner
		
		//Para ler uma palavra (texto sem espaços):
		String nome;
		System.out.println("Qual seu nome?");
		nome = sc.next();
		
		
		//Para ler um número inteiro:
		int numero;
		System.out.println("Qual a sua idade?");
		numero = sc.nextInt();
		
		
		//Para ler um numero com ponto flutuante
		double salario;
		System.out.println("Informe seu salário:");
		salario = sc.nextDouble();
		
		/*
		 * ATENÇÃO:Para considerar o separador de decimais como ponto,
		 * ANTES da declaração do Scanner, faça:Locale.setDefault(Locale.US);
		 */
		
		//Para ler um caractere:
		char letra;
		System.out.println("Digite uma letra:");
		letra = sc.next().charAt(0);
		
		
		
		System.out.println("Seja bem vindo(a) "+nome);
		System.out.println("Você tem: "+numero+" anos.");
		System.out.printf("Seu salário é de R$%.2f\n",salario);
		System.out.println("Você digitou a letra: "+letra);
		
		sc.close();

	}

}
