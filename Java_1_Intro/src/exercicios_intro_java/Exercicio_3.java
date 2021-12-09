package exercicios_intro_java;

import java.util.Scanner;

public class Exercicio_3 {
	/*Programa 3 - Segundos em horas, minutos e segundos
	 * Autore: catarina
	 * Data: 09/12/2021
	 */

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
			
		String nome="";
		int valortotal, segundos, minutos, horas;
					
		System.out.println("Olá, diga o nome de seu evento:");
		nome = scanner.next();
			
		System.out.println ("Olá, seu evento: " + nome + ", teve quantos segundos?");
		valortotal = scanner.nextInt();

		minutos = (valortotal/60);
		horas = (minutos/60);
		minutos = (minutos%60);
		segundos = (valortotal%60);
			
		System.out.println ("Seu evento teve duração de " + horas + " hora(s), " + minutos + " minuto(s) e " + segundos + " segundo(s)");
			
		scanner.close();
		}
	}
