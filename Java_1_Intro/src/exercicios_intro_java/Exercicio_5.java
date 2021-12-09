package exercicios_intro_java;

import java.util.Scanner;

public class Exercicio_5 {
	/*Programa 5 - Média Ponderada
	 * Autore: catarina
	 * Data: 09/12/2021
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double N1, N2, N3, resultado;

		System.out.println ("Escreva a primeira nota:");
		N1 = scanner.nextDouble();
		
		System.out.println ("Escreva a segunda nota:");
		N2 = scanner.nextDouble();
		
		System.out.println ("Escreva a terceira nota:");
		N3 = scanner.nextDouble();
		
		resultado = ((N1*2) + (N2*3) + (N3*5)) / 3;
		System.out.println ("Seu resultado é = " + resultado);

		scanner.close();
	}

}
