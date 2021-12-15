package exercicio_1;

public class Main {

	public static void main(String[] args) {
	
//		String emitirSom;
		Cachorro 	c1 = 	new Cachorro();
		Cavalo		v1 = 	new Cavalo();
		Preguica 	p1 = 	new Preguica();
		
	
		c1.setNome("Marley");
		c1.setIdade(12);
		c1.setSom("auau");
		
		System.out.println("Nome: " 	+ 	c1.getNome());
		System.out.println("Idade: " 	+ 	c1.getIdade());
		System.out.print  ("Som: " 		+ 	c1.getSom());
		c1.Correr();
		
		v1.setNome("Brodines");
		v1.setIdade(3);
		v1.setSom("brrrrr");
		
		System.out.println("Nome: " 	+ 	v1.getNome());
		System.out.println("Idade: " 	+ 	v1.getIdade());
		System.out.println("Som: " 		+ 	v1.getSom());
		v1.Correr();
		
		p1.setNome("Clayton");
		p1.setIdade(1);
		p1.setSom(" ? ");
		p1.Subir();
		
		System.out.println("Nome: " 	+ 	p1.getNome());
		System.out.println("Idade: " 	+ 	p1.getIdade());
		System.out.println("Som: " 		+ 	p1.getSom());

	
	}

}
