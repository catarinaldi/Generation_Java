package exercicios_intro_java;

import java.util.Scanner;

public class Exercicio_2 {
	/*Programa 2 - Dias em anos, meses e dias
	 * Autore: catarina
	 * Data: 09/12/2021
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String nome="";
		int dias, ano, mes, dia;
		
		System.out.println("Ol�, diga o seu nome: ");
		nome = scanner.next();
		
		System.out.println("Ol�, " + nome + ", qual a sua idade em dias?");
		dias = scanner.nextInt();
		
		ano = dias/365;
		mes = ((dias%365)/30);
		dia = (mes%30);
		
		System.out.println("Sua idade em anos, meses e dias � igual a " + ano + " ano(s), " + mes + " mes(es) e " + dia + " dia(s)");
	
		scanner.close();
		
	}
}