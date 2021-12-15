package exercicio_1;

public class Main {

	public static void main(String[] args) {
	
//		String emitirSom;
		Cachorro 	c1 = 	new Cachorro();
		Cavalo		v1 = 	new Cavalo();
		Preguica 	p1 = 	new Preguica();
		
	
		c1.setNome("Marley");
		c1.setIdade(12);
		
		System.out.println("Nome: " 	+ 	c1.getNome());
		System.out.print  ("Idade: " 	+ 	c1.getIdade());
		c1.emitirSom();
		c1.Correr();
		
		System.out.println("");
		
		v1.setNome("Brodines");
		v1.setIdade(3);
		
		System.out.println("Nome: " 	+ 	v1.getNome());
		System.out.print  ("Idade: " 	+ 	v1.getIdade());
		v1.emitirSom();
		v1.Correr();
		
		System.out.println("");
		
		p1.setNome("Clayton");
		p1.setIdade(1);
		
		System.out.println("Nome: " 	+ 	p1.getNome());
		System.out.print  ("Idade: " 	+ 	p1.getIdade());
		p1.emitirSom();
		p1.Subir();
		

	
	}

}
