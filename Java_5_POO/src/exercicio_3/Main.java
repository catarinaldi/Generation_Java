package exercicio_3;

public class Main {
	/*Programa 3 - POO
	 * Autore: catarina
	 * Data: 14/12/2021
	 */
	
	public static void main(String[] args) {
		
		Eletronico e1 = new Eletronico();
		Eletronico e2 = new Eletronico();
		
		e1.tipo = "Celular";
		e1.modelo = "Android";
		e1.cor = "Branco";
		
		e2.tipo = "Celular";
		e2.modelo = "Iphone";
		e2.cor = "Rosa";
		
		System.out.println("Tipo de eletrônico: " + e1.tipo + "\nModelo: " + e1.modelo + "\nCor: " + e1.cor);
		System.out.println("Tipo de eletrônico: " + e2.tipo + "\nModelo: " + e2.modelo + "\nCor: " + e2.cor);
		System.out.print("Tem: ");
		e1.acessoInternet();
		System.out.print("E ");
		e1.pesquisar();
		
	}
	
}
