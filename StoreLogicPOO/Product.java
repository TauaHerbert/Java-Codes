package StoreLogicPOO;

import java.math.BigDecimal;

public class Product {
	
	private int id;
	private String nome;
	private BigDecimal preco;
	private int idCategoria;
	
	public Product() {
		
	}
	
	public Product(int id, String nome, BigDecimal preco, int idCategoria) {
		this.id = id;
		this.nome = nome;
		this.setPreco(preco);
		this.idCategoria = idCategoria;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		if (preco.compareTo(BigDecimal.ZERO) > 0) {
			this.preco = preco;
		}
	}
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	
	public BigDecimal calcularPrecoFinal() {
		return this.preco;
	}
	
}
