package exercicio_6;

public class Main {
	/*Programa 6 - POO
	 * Autore: catarina
	 * Data: 14/12/2021
	 */
	
	public static void main(String[] args) {
		
		ContaBancaria c1 = new ContaBancaria();
		ContaBancaria c2 = new ContaBancaria();
		
		c1.nome = "Katyellen";
		c1.idade = 22;
		c1.agencia = "0109";
		c1.banco = "Itaú";
		
		c2.nome = "Peres";
		c2.idade = 52;
		c2.agencia = "0023";
		c2.banco = "Bradesco";
				
		System.out.println(c1.nome + " tem " + c1.idade + " possui conta na agência " + c1.agencia + " no banco " + c1.banco);		
		System.out.println("==============================================================");
		System.out.println(c2.nome + " tem " + c2.idade + " possui conta na agência " + c2.agencia + " no banco " + c2.banco);
		c2.dividas();
		
	}
	
}
