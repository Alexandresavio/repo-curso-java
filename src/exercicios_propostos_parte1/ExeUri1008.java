package exercicios_propostos_parte1;

import java.util.Scanner;

public class ExeUri1008 {

	public static void main(String[] args) {
		/*
		 * Escreva um programa que leia o número de um funcionário, 
		 * seu número de horas trabalhadas, o valor que recebe por 
		 * hora e calcula o salário desse funcionário. A seguir, mostre 
		 * o número e o salário do funcionário, com duas casas decimais.
		 * 
		 * Entrada
		 * O arquivo de entrada contém 2 números inteiros e 1 número com 
		 * duas casas decimais, representando o número, quantidade de horas 
		 * trabalhadas e o valor que o funcionário recebe por hora trabalhada,
		 * respectivamente.
		 * 
		 * Saída
		 * Imprima o número e o salário do funcionário, conforme exemplo fornecido,
		 * com um espaço em branco antes e depois da igualdade.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero do funcionario:");
		int numFuncionario = sc.nextInt();
		System.out.println("Digite o total de horas trabalhadas:");
		int totalHoraTrabalhada = sc.nextInt();
		System.out.println("Digite o valor da hora trabalhada:");
		double valorHora = sc.nextDouble();
		
		double salario = valorHora * totalHoraTrabalhada;
		System.out.println("Numero = "+numFuncionario);
		System.out.printf("Salario = %.2f\n",salario);
		
		
		
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
