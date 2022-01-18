package exercicio_3;

public class Main {

	public static void main(String[] args) {

		Loja loja = new Loja();
		
		loja.adicionar("Camiseta");
		loja.adicionar("Camisa social");
		loja.adicionar("Saia");
		loja.adicionar("Vestido");
		loja.adicionar("Camiseta Polo");
		loja.adicionar("Macacão");
		
		loja.listar();
		
		loja.atualizar(1, "Calça");
		
		loja.listar();
		
		loja.remover(0);
		
		loja.listar();

	}

}
