package exercicio_4;

public class Main {
	/*Programa 4 - POO
	 * Autore: catarina
	 * Data: 14/12/2021
	 */
	
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		
		f1.genero = "Feminino";
		f1.idade = 23;
		f1.email = "ana@hotmail.com";
		f1.etnia = "branco";
		
		f2.genero = "Masculino";
		f2.idade = 42;
		f2.email = "kim@hotmail.com";
		f2.etnia = "preto";
		
		System.out.println("Genero: " + f1.genero + "\nIdade: " + f1.idade + "\nemail: " + f1.email + "\nEtnia: " + f1.etnia);
		System.out.print("É: ");
		f1.proatividade();
		
		System.out.println();
		
		System.out.println("Genero: " + f2.genero + "\nIdade: " + f2.idade + "\nemail: " + f2.email + "\nEtnia: " + f2.etnia);
		System.out.print("É: ");
		f2.proatividade();
		
	}
	
}
