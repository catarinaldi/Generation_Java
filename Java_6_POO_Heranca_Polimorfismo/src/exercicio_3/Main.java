package exercicio_3;

public class Main {

	public static void main(String[] args) {

		Loja loja = new Loja();
		
		loja.adicionar("Camiseta");
		loja.adicionar("Camisa social");
		loja.adicionar("Saia");
		loja.adicionar("Vestido");
		loja.adicionar("Camiseta Polo");
		loja.adicionar("Macac�o");
		
		loja.listar();
		
		loja.atualizar(1, "Cal�a");
		
		loja.listar();
		
		loja.remover(0);
		
		loja.listar();

	}

}
