package exercicio_5;

public class Main {
	/*Programa 5 - POO
	 * Autore: catarina
	 * Data: 14/12/2021
	 */
	
	public static void main(String[] args) {
		
		Patinete p1 = new Patinete();
		Patinete p2 = new Patinete();
		
		p1.rodas = 3;
		p1.modelo = "Skatenet Max Pink";
		p1.cor = "Vermelho";
		p1.sinos = "Sim";
		
		p2.rodas = 2;
		p2.modelo = "Town 5 XL Oxelo SC";
		p2.cor = "Preto";
		p2.sinos = "Não";
		
		
		System.out.println("Possuí " + p1.rodas + " rodas" + "\nModelo: " + p1.modelo +
				"\nCor: " + p1.cor + "\nPossui sinos: " + p1.sinos);
		
		System.out.println();
		
		System.out.println("Possuí " + p2.rodas + " rodas" + "\nModelo: " + p2.modelo +
				"\nCor: " + p2.cor + "\nPossui sinos: " + p2.sinos);
		p2.acelerar();
		
	}
	
}
