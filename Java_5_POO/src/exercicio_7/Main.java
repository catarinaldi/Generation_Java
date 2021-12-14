package exercicio_7;

public class Main {
	/*Programa 7 - POO
	 * Autore: catarina
	 * Data: 14/12/2021
	 */
	
	public static void main(String[] args) {
		
		Paciente p1 = new Paciente();
		Paciente p2 = new Paciente();
		
		p1.nome = "Felícia";
		p1.idade = 97;
		p1.emergencia = "Não";
		p1.causa = "Dores abdominais";
		
		p2.nome = "Clerisvaldo";
		p2.idade = 22;
		p2.emergencia = "Sim";
		p2.causa = "Facada no peito";
				
		System.out.println("Nome: " + p1.nome + "\nIdade: " + p1.idade +
					"\nEmergência: " + p1.emergencia + "\nCausa: " + p1.causa);		
		p1.dores();
		
		System.out.println("====================================");
		
		System.out.println("Nome: " + p2.nome + "\nIdade: " + p2.idade +
				"\nEmergência: " + p2.emergencia + "\nCausa: " + p2.causa);	
		p2.dores();
		
	}
	
}
