package exercicios_laco_de_decisao;

import java.util.Scanner;

public class Exercicio_3 {
	/*Programa 3 - Categorias
	 * Autore: catarina
	 * Data: 09/12/2021
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Escreva sua idade:");
		idade = scanner.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			System.out.println("Categoria infantil!");
		}
		
		if (idade >= 15 && idade <= 17) {
			System.out.println("Categoria juvenil!");
		}
		
		if (idade >= 18 && idade <= 25) {
			System.out.println("Categoria adulto!");
		}
	
		scanner.close();
	}

}
