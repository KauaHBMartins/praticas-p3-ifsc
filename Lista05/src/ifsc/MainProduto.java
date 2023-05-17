package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {
		
		ArrayList<Produto> Produtos = new ArrayList<>();
		
		Produto p = new Produto();
		p.setNome("Pedra");
		p.setPreco(159.99);
		p.setFornecedor("MercadoLivre");
		p.setCodBarras(112222l);
		Produtos.add(p);

		Produto n = new Produto();
		n.setNome("Madeira");
		n.setPreco(14.67);
		n.setFornecedor("MinasMJ");
		n.setCodBarras(11222243l);
		Produtos.add(n);

		Produto m = new Produto();
		m.setNome("Agua");
		m.setPreco(20.00);
		m.setFornecedor("SãoPaulo");
		m.setCodBarras(11222212l);
		Produtos.add(m);

		for (int i = 0; i < Produtos.size(); i++) {
			System.out.println(Produtos.get(i).getNome());
			System.out.println(Produtos.get(i).getPreco());
			System.out.println(Produtos.get(i).getFornecedor());
			System.out.println(Produtos.get(i).getCodBarras());

		}

	}

}
