package Visao;

import Controle.ProdutoDAO;
import Modelo.Produto;

public class MainProduto {

	public static void main(String[] args) {

		Produto p = new Produto();
		p.setNome("papel");
		p.setCodBarras((long)12314);
		
		ProdutoDAO dao = new ProdutoDAO();
		dao.inserir(p);
		System.out.println(p.getNome());
		dao.alterar(p);
		System.out.println(p.getNome());
		dao.excluir(p);
		dao.list();
		System.out.println(dao.list().size());

	}

}
