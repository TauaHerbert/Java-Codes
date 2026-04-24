package StoreLogicPOO;

import java.math.BigDecimal;

public class Eletronico extends Product{
	
	private String marca;
	private int garantiaMeses;
	private String voltagem;
	
	public Eletronico() {
		
	}
	
	public Eletronico(int id, String nome, BigDecimal preco , int idCategoria, String marca, int garantiaMeses, String voltagem) {
		super(id, nome, preco, idCategoria);
		
		this.marca = marca;
		this.garantiaMeses = garantiaMeses;
		this.voltagem = voltagem;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getGarantiaMeses() {
		return garantiaMeses;
	}
	public void setGarantiaMeses(int garantiaMeses) {
		this.garantiaMeses = garantiaMeses;
	}
	public String getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(String voltagem) {
		this.voltagem = voltagem;
	}
	
	@Override
	public BigDecimal calcularPrecoFinal() {
		if (this.garantiaMeses > 12) {
			return this.getPreco().multiply(new BigDecimal("1.10"));
		}
		return this.getPreco();
	}
	
}
