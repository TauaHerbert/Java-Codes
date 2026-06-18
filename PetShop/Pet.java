package PetShop;

public class Pet {
	
	private final String nome;
	private boolean clean;
	
	public Pet(String nome) {
		this.nome = nome;
		this.clean = false;
	}

	public boolean isClean() {
		return clean;
	}

	public void setClean(boolean clean) {
		this.clean = clean;
	}

	public String getNome() {
		return nome;
	}

}
