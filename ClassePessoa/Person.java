package ClassePessoa;

public record Person(String nome, int idade) {

	public String getInfo() {
		return "Nome: "+nome+" || Idade: "+idade;
	}
}
