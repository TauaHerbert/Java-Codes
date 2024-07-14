package Class1;

public class ClassePessoa {
	
	String nome;
	String acao = "";
	
	public void comer() {
		if (acao.equals("comendo")) {
			System.out.println(nome+" já esta comendo!");
		}else if(acao.equals("dormindo")) {
			System.out.println(nome+" não pode comer poruqe está dormindo!");
		}else if(acao.equals("andando")) {
			System.out.println(nome+" não pode comer porque está andando!");
		}else {
			System.out.println(nome+" está comendo!");
			acao = "comendo";
		}
		
	}
	
	public void dormir() {
		if (acao.equals("dormindo")) {
			System.out.println(nome+" já esta dormir!");
		}else if(acao.equals("andando")) {
			System.out.println(nome+" não pode dormir porque está andando!");
		}else if(acao.equals("comendo")) {
			System.out.println(nome+" não pode dormir porque está comendo!");
		}else {
			System.out.printf("%s está dormindo!", nome);
			acao = "dormindo";
		}
		
	}
	
	public void andar() {
		if (acao.equals("andando")) {
			System.out.println(nome+" já esta andando!");
		}else if(acao.equals("dormindo")) {
			System.out.println(nome+" não pode andar porque está dormindo!");
		}else if(acao.equals("comendo")) {
			System.out.println(nome+" não pode andar poruqe está comendo!");
		}else {
			System.out.println(nome+" está andando!");
			acao = "andando";
		}
	}
	
	public void paraComer() {
		if (acao.equals("comendo")) {
			System.out.println(nome+" parou de comer!");
			acao = "";
		}else {
			System.out.println(nome+" não está comendo!");
		}
	}
	
	public void paraDormir() {
		if (acao.equals("dormindo")) {
			System.out.println(nome+" parou de dormir!");
			acao = "";
		}else {
			System.out.println(nome+" não esta dormindo!");
		}
	}
	
	public void paraAndar() {
		if (acao.equals("andando")) {
			System.out.println(nome+" parou de andar!");
			acao = "";
		}else {
			System.out.println(nome+" não esta andando!");
		}
	}
}
