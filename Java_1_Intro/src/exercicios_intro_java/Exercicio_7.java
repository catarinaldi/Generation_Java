package exercicios_intro_java;

import java.util.Scanner;

public class Exercicio_7 {
	/*Programa 7 - Equa��es Lineares
	 * Autore: catarina
	 * Data: 09/12/2021
	 */
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		double A, B, C, D, E, F, X, Y;
		
		System.out.println ("D� valores para A");
		A = scanner.nextDouble();

		System.out.println ("D� valores para B");
		B = scanner.nextDouble();

		System.out.println ("D� valores para C");
		C = scanner.nextDouble();

		System.out.println ("D� valores para D");
		D = scanner.nextDouble();

		System.out.println ("D� valores para E");
		E = scanner.nextDouble();
	
		System.out.println ("D� valores para F");
		F = scanner.nextDouble();
	
	
		X=((C*E) - (B*F)) / ((A*E) - (B*D));
		Y=((A*F) - (C*D)) / ((A*E) - (B*D));

		System.out.println ("O resultado de X = " + X + " E o resultado de Y = " + Y);

		scanner.close();
	}

}
