package exercicios_laco_de_decisao;

import java.util.Scanner;

public class Exercicio_2 {
	/*Programa 2 - Ordem crescente
	 * Autore: catarina
	 * Data: 09/12/2021
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Escreva três números:");
		n1 = scanner.nextInt();
		n2 = scanner.nextInt();
		n3 = scanner.nextInt();
		
		if (n1 >= n2 && n2 >= n3) {
			System.out.println("Números em ordem crescente: " + n3 + " | " + n2 + " | " + n1);	
		}	else if (n1 >= n3 && n3 >= n2) {
			System.out.println("Números em ordem crescente: " + n2 + " | " + n3 + " | " + n1);
		}	else if (n2 >= n1 && n1 >= n3) {
			System.out.println("Números em ordem crescente: " + n3 + " | " + n1 + " | " + n2);	
		}	else if (n2 >= n3 && n3 >= n1) {
			System.out.println("Números em ordem crescente: " + n1 + " | " + n3 + " | " + n2);
		}	else if (n3 >= n2 && n2 >= n1) {
			System.out.println("Números em ordem crescente: " + n1 + " | " + n2 + " | " + n3);	
		}	else if (n3 >= n1 && n1 >= n2) {
			System.out.println("Números em ordem crescente: " + n2 + " | " + n1 + " | " + n3);
		}
	
		scanner.close();
		
	}
}
