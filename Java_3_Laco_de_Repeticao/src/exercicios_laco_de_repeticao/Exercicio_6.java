package exercicios_laco_de_repeticao;

import java.util.Scanner;

public class Exercicio_6 {
	/*Programa 6 - Do while (2)
	 * Autore: catarina
	 * Data: 10/12/2021
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num, soma = 0, div = 0, media = 0;
		
		do {
			System.out.println("Escreva um número: ");
			num = scanner.nextInt();
			if(num % 3 == 0 && num != 0) {
				soma += num;
				div++;
			}
			}while (num != 0);

		media = soma / div;
		System.out.println("Média dos números múltiplos de três: " + media);
		
		scanner.close();	
	
	}

}
