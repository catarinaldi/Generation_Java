package exercicios_laco_de_decisao;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num1, num2, num3, maiorNum = 0;
		
		System.out.println("Escreva um n�mero:");
		num1 = scanner.nextInt();
		
		System.out.println("Escreva um n�mero:");
		num2 = scanner.nextInt();
		
		System.out.println("Escreva um n�mero:");
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
		
		System.out.println("O maior n�mero � " + maiorNum + "!!!");
		
		scanner.close();
		


	}
}