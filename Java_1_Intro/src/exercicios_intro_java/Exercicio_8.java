package exercicios_intro_java;

import java.util.Scanner;

public class Exercicio_8 {
	/*Programa 8 - Porcentagem
	 * Autore: catarina
	 * Data: 09/12/2021
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double custoConsumidor, custoFabrica, distribuidor, imposto;
		
		System.out.println("Qual o custo de fábrica do carro? ");
		custoFabrica = input.nextDouble();
		
		distribuidor = (custoFabrica * 1.28);
		imposto = (custoFabrica * 1.45);
		
		custoConsumidor = (custoFabrica + distribuidor + imposto);
		
		System.out.println("O custo do carro para o consumidor sera igual a R$: " + custoConsumidor);
		
		input.close();
		
				

	}

}
