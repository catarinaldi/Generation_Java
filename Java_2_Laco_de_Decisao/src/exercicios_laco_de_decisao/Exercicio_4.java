package exercicios_laco_de_decisao;

import java.util.Scanner;

public class Exercicio_4 {
	/*Programa 4 - Par ou Ímpar
	 * Autore: catarina
	 * Data: 09/12/2021
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double n1, raiz, potencia;
		
		System.out.println("Digite um número");
		n1 = scanner.nextDouble();
		
		if (n1 % 2 == 0) {
			raiz = Math.sqrt(n1);
			System.out.println("O número é par! E sua raiz quadrada é igual a: " + raiz);
		} else {
			potencia = Math.pow(n1, 2);
			System.out.println("O número é ímpar! E sua potência é igual a: " + potencia);
		}

	}
}
