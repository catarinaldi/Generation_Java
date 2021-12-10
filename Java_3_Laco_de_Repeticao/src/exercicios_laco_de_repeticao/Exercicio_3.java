package exercicios_laco_de_repeticao;

import java.util.Scanner;

public class Exercicio_3 {
	/*Programa 3 - While (1)
	 * Autore: catarina
	 * Data: 10/12/2021
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int idade, i = 0, i2 = 0;
		
		System.out.println("Escreva sua idade");
		idade = scanner.nextInt();
		
		while (idade < -99) {
			if (idade <= 21) {
				i++;
			} else if (idade >= 50) {
					i2++;
				}
			}

		System.out.printf ("Idade");
	}

}
