package estrutura_condicional;

import java.util.Scanner;

public class EstruturaSwitchCase {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um valor inteiro de 1 a 7
		 * representando um dia da semana sendo
		 * 1 = domingo,
		 * 2 = segunda,
		 * e assim por diante).Escrever na tela o dia da semana 
		 * correspondente.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Que dia da semana é hoje? " );
		System.out.println("---------------------------");
		System.out.println("[1] - Domingo");
		System.out.println("[2] - Segunda-feira");
		System.out.println("[3] - Terça-feira");
		System.out.println("[4] - Quarta-feira");
		System.out.println("[5] - Quinta-feira");
		System.out.println("[6] - Sexta-feira");
		System.out.println("[7] - Sábado");
		System.out.println("[8] - Sair");
		System.out.println("---------------------------");
		int dia = sc.nextInt();
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Terça-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("Sábado");
			break;

		default:
			System.out.println("Obrigado por informar.");
			break;
		}
		
		sc.close();
		
		
		
		
		
		

	}

}
