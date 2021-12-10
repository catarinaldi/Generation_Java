package exercicios_laco_de_repeticao;

public class Exercicio_1 {
	/*Programa 1 - For (1)
	 * Autore: catarina
	 * Data: 10/12/2021
	 */
	public static void main(String[] args) throws InterruptedException {
		
		double n1, result;
		
		for(n1 = 1000; n1 <= 1999; n1++) {
			result = n1 % 11;
			if(result == 5) {
				System.out.println("Os números serão: " + n1);
				Thread.sleep(500);
			}
			
		}

	}

}
