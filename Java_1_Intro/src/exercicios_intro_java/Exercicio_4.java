package exercicios_intro_java;

import java.util.Scanner;

public class Exercicio_4 {
	/*Programa 4 - Potências
	 * Autore: catarina
	 * Data: 09/12/2021
	 */

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double A, B, C, D, R, S;

		System.out.println ("Digite um valor:");
		A = scanner.nextDouble();

		System.out.println ("Digite um segundo valor:");
		B = scanner.nextDouble();

		System.out.println ("Digite um terceiro valor:");
		C = scanner.nextDouble();

		R=Math.pow((A+B), 2);
		S=Math.pow((B+C), 2);
		D=(R+S)/2;

		System.out.println ("O resultado é igual a " + D);

		scanner.close();
	}

}
