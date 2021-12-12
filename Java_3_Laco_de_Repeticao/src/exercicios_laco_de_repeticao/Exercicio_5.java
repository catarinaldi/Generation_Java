package exercicios_laco_de_repeticao;

import java.util.Scanner;

public class Exercicio_5 {
	/*Programa 5 - Do while (1)
	 * Autore: catarina
	 * Data: 10/12/2021
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int num, soma = 0;
		
		do {
			System.out.println("Digite um número: ");
			num = scanner.nextInt();
			soma += num;
			} while (num != 0);
				
		
		System.out.println("A soma é igual a: " + soma);
		
		scanner.close();
	}

}

