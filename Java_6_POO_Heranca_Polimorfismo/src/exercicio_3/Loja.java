package exercicio_3;

import java.util.ArrayList;

public class Loja {
		
		ArrayList<String> produtos_loja = new ArrayList<>();
		
		public void adicionar(String p) {
			produtos_loja.add(p);
			System.out.println(p + " - Produto adicionado ao estoque da loja!");
		}
		
		public void remover(int p) {
			produtos_loja.remove(p);
			System.out.println("");
			System.out.println(p + " - Produto removido do estoque da loja!");
			System.out.println("");
		}
		
		public void atualizar(int p, String pr) {
			produtos_loja.set(p, pr);
			System.out.println("");
			System.out.println("||  Estoque atualizado!  ||");
			System.out.println("");
		}
		
		public void listar() {
			for(int i = 0; i < produtos_loja.size(); i++) {
				System.out.println(i + " - " + produtos_loja.get(i));
			}
		}
		
}