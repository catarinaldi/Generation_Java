package exercicio_2;

public class Main {
	/*Programa 2 - POO
	 * Autore: catarina
	 * Data: 14/12/2021
	 */
	
	public static void main(String[] args) {
		
		Aviao a1 = new Aviao();
		
		a1.destino = "Marocos";
		a1.companhiaAerea = "Gol";
		
		System.out.println("Destino: " + a1.destino + "\nCompanhia A�rea: " + a1.companhiaAerea);
		System.out.print("O avi�o est� ");
		a1.voar();
	}
}