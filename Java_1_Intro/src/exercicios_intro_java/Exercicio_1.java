package exercicios_intro_java;

import java.util.Scanner;

public class Exercicio_1 {
	/*Programa 1 - Idade em dias
	 * Autore: catarina
	 * Data: 08/12/2021
	 */
	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
	
		String nome="";
		int ano, mes, dia, idade;
						
		System.out.println("Olá, diga o seu nome:");
		nome = scanner.next();
		
		System.out.println("Olá, " + nome + ", quantos anos você tem?");
		ano = scanner.nextInt();
		
		System.out.println("Olá, " + nome + ", quantos meses você tem?");
		mes = scanner.nextInt();
		
		System.out.println("Olá, " + nome + ", quantos dias você tem?");
		dia = scanner.nextInt();
		
		mes = mes*30;
		ano = ano*365;
		idade = dia+mes+ano;
		
		System.out.flush();
		
		System.out.println ("Sua idade em dias é igual a " + idade);
				
				
		}

}
