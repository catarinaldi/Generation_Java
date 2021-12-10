package exercicios_laco_de_decisao;

import java.util.Scanner;

public class Exercicio_1 {
	/*Programa 1 - Maior número
	 * Autore: catarina
	 * Data: 09/12/2021
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num1, num2, num3, maiorNum = 0;
		
		System.out.println("Escreva um número:");
		num1 = scanner.nextInt();
		
		System.out.println("Escreva um número:");
		num2 = scanner.nextInt();
		
		System.out.println("Escreva um número:");
		num3 = scanner.nextInt();
		
		if (num1 >= num2 && num1 >= num3) {
			maiorNum = num1;
		}	
		
		if (num2 >= num3 && num2 >= num1) {
			maiorNum = num2;
		}		
		
		if (num3 >= num1 && num3 >= num2) {
			maiorNum = num3;
		}
		
		System.out.println("O maior número é " + maiorNum + "!!!");
		
		scanner.close();
		


	}
}