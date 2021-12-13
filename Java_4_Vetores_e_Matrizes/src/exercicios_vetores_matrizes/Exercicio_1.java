package exercicios_vetores_matrizes;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double[] vetor = new double [5];
		int maior = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite a " + (i+1) + "ª nota: ");
			vetor[i] = scanner.nextDouble();
			if (vetor[i] >= maior) {
				maior = (int) vetor[i];
			}
		}
		
		System.out.println("As notas digitadas foram: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " | ");
		}
		System.out.print("\nA maior nota foi: " + maior + "!");
		
		
	}

}
