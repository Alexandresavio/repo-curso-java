package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class CondicionalSimples {

	public static void main(String[] args) {

		/*
		 * REGRA: V: executa o bloco de comandos F: pula o bloco de comandos
		 * 
		 * exemplo: Fazer um programa para ler as duas notas que um aluno obteve no
		 * primeiro e segundo semestres de uma disciplina anual. Em seguida, mostrar a
		 * nota final que o aluno obteve no ano juntamente com um texto explicativo.
		 * Caso a nota final do aluno seja inferior a 60.00, mostrar a mensagem
		 * "REPROVADO". Todos os valores devem ter uma casa decimal.
		 * 
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a 1ª nota:");
		double nota1 = sc.nextDouble();
		System.out.println("Digite a 2ª nota:");
		double nota2 = sc.nextDouble();
		
		double notaFinal = nota1 + nota2;
		
		System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
		if (notaFinal < 60.0) {
			System.out.println("REPROVADO");
		}
		sc.close();

	}

}
