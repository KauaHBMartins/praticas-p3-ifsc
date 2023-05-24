package Controle;

import java.util.ArrayList;

import Modelo.Produto;

public class ProdutoDAO {

		ArrayList <Produto> papel;
		
		
		public ProdutoDAO() {
			papel = new ArrayList<Produto>();
		}
		
		
		public boolean inserir (Produto p)
		{
			papel.add(p);
			return true;
		}
		
		
		public boolean alterar(Produto p){
			for(Produto produto : papel) {
				if(produto.getCodBarras() == p.getCodBarras()) {
					produto.setNome("pedra");
					return true;
				}
			}
			return false;
		}
		
		
		public boolean excluir(Produto p){
			for(Produto produto : papel) {
				if(produto.getCodBarras() == p.getCodBarras()) {
					papel.remove(produto);
					 return true;
					
				}
			}
			return true;
		}
		
		
		public ArrayList<Produto> list(){
			return this.papel;
			
		}
		
	


}
