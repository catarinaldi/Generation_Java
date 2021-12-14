package exercicio_1;

public class Main {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		
		c1.nome = "Joanna";
		c1.idade = 33;
		
		
		System.out.println("Nome da cliente: " + c1.nome + "\nIdade da cliente: " + c1.idade);
		System.out.print("Ela está ");
		c1.andar();
	}
}
