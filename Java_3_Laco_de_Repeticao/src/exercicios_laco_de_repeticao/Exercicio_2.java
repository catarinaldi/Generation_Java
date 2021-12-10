package exercicios_laco_de_repeticao;

import java.util.Scanner;

public class Exercicio_2 {
	/*Programa 2 - For (2)
	 * Autore: catarina
	 * Data: 10/12/2021
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int i, num, par = 0, impar = 0;
		
		
		for (i = 0; i < 10; i++) {
			System.out.println("Escreva um número:");
			num = scanner.nextInt();
				if (num % 2 == 0) {
					par++;
				}
				if (num % 2 != 0) {
					impar++;
				}
		}
		
		System.out.println("Quantidade de números pares: " + par);
		System.out.println("Quantidade de números ímpares: " + impar);
		
		scanner.close();
		
	}
}
