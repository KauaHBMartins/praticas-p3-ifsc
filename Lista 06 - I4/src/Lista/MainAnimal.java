package Lista;

public class MainAnimal {

	public static void main(String[] args) {
		
		Cachorro c = new Cachorro();
		c.setNome("Bliau");
		c.setRaca("Buldog");
		c.setCor("preto");
		c.setNumeroPatas(4);
		c.setEcossistema("Quintal");
		c.setComprimento((float) 62);
		
		Gato g = new Gato();
		g.setNome("Glau");
		g.setRaca("Gato");
		g.setCor("Prata");
		g.setNumeroPatas(4);
		g.setEcossistema("Quarto");
		g.setComprimento((float) 5);
		
		System.out.println(c.getNome());
		System.out.println(c.getRaca());
		System.out.println(c.getCor());
		System.out.println(c.getNumeroPatas());
		System.out.println(c.getEcossistema());
		System.out.println(c.getComprimento());
		c.Late();
		
		System.out.println("--------");
		System.out.println(g.getNome());
		System.out.println(g.getRaca());
		System.out.println(g.getCor());
		System.out.println(g.getNumeroPatas());
		System.out.println(g.getEcossistema());
		System.out.println(g.getComprimento());
		g.Mia();
		
	}

}
