package exercicios_intro_java;

import java.util.Scanner;

public class Exercicio_6 {
	/*Programa 6 - Distância entre dois pontos
	 * Autore: catarina
	 * Data: 09/12/2021
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double X1, X2, Y1, Y2, W, D;

		System.out.println ("Qual a localização do ponto um no plano? P1(x1)");
		X1 = scanner.nextDouble();
		
		System.out.println ("Qual a localização do ponto um no plano? P1(y1)");
		Y1 = scanner.nextDouble();

		System.out.println ("Qual a localização do ponto dois no plano? P2(x2)");
		X2 = scanner.nextDouble();

		System.out.println ("Qual a localização do ponto dois no plano? P2(y2)");
		Y2 = scanner.nextDouble();

		W = Math.pow((X2-X1), 2) + Math.pow((Y2-Y1), 2);
		D = Math.sqrt(W);

		System.out.println ("Seu resultado é = " + D);
		
		scanner.close();
	}

}
