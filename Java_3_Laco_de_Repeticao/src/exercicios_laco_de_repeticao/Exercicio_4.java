package exercicios_laco_de_repeticao;

import java.util.Scanner;

public class Exercicio_4 {
	/*Programa 4 - While (2)
	 * Autore: catarina
	 * Data: 10/12/2021
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int idade, sexo = 0, opc, quarenta = 0, menorDezoito = 0, feminino = 0, masculino = 0, outros = 0, mental = 0;
		int	calmo = 0, nervoso = 0, agressivo = 0, p = 0, mnervosas = 0, hagressivos = 0, ocalmes = 0, quarentanervosas = 0;
		int menorCalmas = 0;
		
		while (p < 150) {
			System.out.println("Digite sua idade: ");
			idade = scanner.nextInt();
			if (idade >= 40) {
				quarenta++;
			}else if (idade < 18) {
				menorDezoito++;
			}
			
			System.out.println("Digite seu sexo: 1 - feminino, 2 - masculino, 3 - outros ");
			sexo = scanner.nextInt();
			if (sexo == 1) {
				feminino++;
			}else if (sexo == 2) {
				masculino++;
			}else if (sexo == 3) {
				outros++;
			}else {
				System.out.println("Opção Inválida!");
			}
		
			System.out.println("Digite seu estado mental: 1 - calmo, 2 - nervoso, 3 - agressivo ");
			mental = scanner.nextInt();
			if (mental == 1) {
				calmo++;
			}else if (mental == 2) {
				nervoso++;
			}else if (mental == 3) {
				agressivo++;
			}else {
				System.out.println("Opção Inválida!");
			}
					
			if (sexo == 1 && mental == 2) {
				mnervosas++;
			}
			if (sexo == 2 && mental == 3) { 
				hagressivos++;
			}
			if (sexo == 3 && mental == 1) {
				ocalmes++;
			}
			if (idade >= 40 && mental == 2) {
				quarentanervosas++;
			}
			if (idade <= 18 && mental == 1) {
				menorCalmas++;
			}
			
			p++;
		}
		
		System.out.println("Número de pessoas entrevistadas: " + p);
		System.out.println("Número de pessoas calmas: " + calmo);
		System.out.println("Número de mulheres nervosas: " + mnervosas);
		System.out.println("Número de homens agressivos: " + hagressivos);
		System.out.println("Número de 'outros' calmes: " + ocalmes);
		System.out.println("Número de pessoas nervosas com mais de quarenta anos: " + quarentanervosas);
		System.out.println("Número de pessoas calmas com menos de dezoito anos: " + menorCalmas);
		
		scanner.close();
	}

}
