package exercicios_laco_de_repeticao;

import java.util.Scanner;

public class Exercicio_3 {
	/*Programa 3 - While (1)
	 * Autore: catarina
	 * Data: 10/12/2021
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int idade = 0, i = 0, i2 = 0;
		
		while (idade != -99) {
			System.out.println("Escreva sua idade");
			idade = scanner.nextInt();
			
			if (idade <= 21 && idade >= 0) {
				i++;
			} else if (idade >= 50) {
				i2++;
				}
		}

		System.out.printf ("Quantidade de pessoas com menos de 21: %d\nQuantidade de pessoas com mais de 50: %d", i, i2);
	}

}
