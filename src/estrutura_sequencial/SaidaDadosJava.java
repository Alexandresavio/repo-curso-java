package estrutura_sequencial;

public class SaidaDadosJava {

	public static void main(String[] args) {

		// Para escrever na tela um texto qualquer:

		// Sem quebra de linha ao final:
		System.out.print("Bom dia!");

		// com quebra de linha ao final:
		System.out.println("Fulano");

		System.out.println("Ola novamente, nova linha.");

		// Para escrever o conteúdo de uma variável de algum tipo básico:
		// Suponha uma variável do tipo int declarada e iniciada
		int y = 32;
		System.out.println(y);

		// Para escrever o conteúdo de uma variável com ponto flutuante:
		// Suponha uma variável tipo double declarada e iniciada:
		double x = 10.35784;
		System.out.println(x);
		/*
		 * com o comando (%.) é possivel controlar o número de casas decimais, depois da
		 * virgula.
		 */
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);

		// Para concatenar vários elementos em um mesmo comando de escrita:
		/*
		 * Regra geral para print e println: elemento1 + elemento2 + elemento3 + ... +
		 * elementoN
		 */
		System.out.println("RESULTADO = " + x + " METROS");
		

		// Para concatenar vários elementos em um mesmo comando de escrita:

		/*
		 * Regra geral para printf: "TEXTO1 %f TEXTO2 %f TEXTO3", variavel1, variavel2
		 * %f = ponto flutuante %d = inteiro %s = texto %n = quebra de linha
		 */

		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

	}

}
