package estrutura_condicional;

import java.util.Scanner;

public class AtribuicaoAcumulativa {

	public static void main(String[] args) {
		/*
		 * Uma operadora de telefonia cobra R$ 50.00 por 
		 * um plano básico que dá direito a 100 minutos de
		 * telefone. Cada minuto que exceder a franquia de
		 * 100 minutos custa R$ 2.00. Fazer um programa para
		 * ler a quantidade de minutos que uma pessoa consumiu,
		 * daí mostrar o valor a ser pago.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		double planoBasico = 100;
		
		System.out.println("Informe a quantidade de minutos usados:");
		int quantidadeMinGasto = sc.nextInt();
		
		double valorPagar = 50.00;
		
		if(quantidadeMinGasto < planoBasico) {
			System.out.printf("Valor a pagar:R$%.2f\n",valorPagar);
		}else {
		  valorPagar +=	(quantidadeMinGasto - planoBasico) * 2;
		  System.out.printf("Valor a pagar:R$%.2f\n",valorPagar);
		}
		
		sc.close();
		

	}

}
