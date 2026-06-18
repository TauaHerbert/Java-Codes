package PetShop;

public class MaquinaDeBanho {

	private boolean clean = true;
	private int agua = 30;
	private int shampoo = 10;
	private Pet pet = null;
	
	public MaquinaDeBanho() {
		
	}
	
	public void banhoNoPet() {
		if(this.pet == null) {
			System.out.println("Coloque o pet para a maquina de banho!");
			return;
		}
		
		this.agua -= 10;
		this.shampoo -=2;
		pet.setClean(true);
		System.out.println("O pet "+pet.getNome()+" esta limpo!");
	}
	
	public void adicionarAgua() {
		if (agua == 30) {
			System.out.println("A capaciadde de agua da maquina esta no maximo!");
			return;
		}
		agua += 2;
	}
	
	public void adicionarShampoo() {
		if (shampoo == 30) {
			System.out.println("A capaciadde de shampoo da maquina esta no maximo!");
			return;
		}
		shampoo += 2;
	}

	public int getAgua() {
		return agua;
	}

	public int getShampoo() {
		return shampoo;
	}
	
	public boolean hasPet() {
		return pet != null;
	}
	
	public void setPet(Pet pet) {
		if (!this.clean) {
			System.out.println("O pet "+this.pet.getNome()+ " esta na maquina nesse momento!");
			return;
		}
		if (hasPet()) {
			System.out.println("A maquina esta suja, para colocar pet é preciso limpar!");
			return;
		}
		this.pet = pet;
	}
	
	public void removerPet() {
		this.clean = this.pet.isClean();
		System.out.println("O pet "+pet.getNome()+ " esta limpo!");
		this.pet = null;
		
	}
	
	public void limparMaquina() {
		this.agua -= 10;
		this.shampoo -= 2;
		this.clean = true;
		System.out.println("A maquina foi limpa!");
	}
}
