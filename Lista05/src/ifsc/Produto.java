package ifsc;

public class Produto {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	private Long codBarras;

	public Long getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(Long codBarras) {
		this.codBarras = codBarras;
	}

	private Double preco;

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	private String fornecedor;

}
