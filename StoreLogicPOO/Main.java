package StoreLogicPOO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		
		List<Product> produtos = new ArrayList<>();
		String continuar = "s";

		while (continuar.equalsIgnoreCase("s")) {
		    System.out.println("O que deseja cadastrar ? (1) Produto Comum (2) Eletrônico: ");
		    int opcao = src.nextInt();
		    src.nextLine();

		    if (opcao == 1) {
		    	System.out.println("------------------------- Produto ----------------------------");
		        Product p = new Product();
		        System.out.println("Informe o ID do Produto: ");
				p.setId(src.nextInt());
				src.nextLine();
				System.out.println("Informe o nome do Produto: ");
				p.setNome(src.nextLine());
				System.out.println("Informe o preço do Produto: ");
				p.setPreco(src.nextBigDecimal());
				System.out.println("Informe a Categoria do Produto: ");
				p.setIdCategoria(src.nextInt());
				src.nextLine();
		        
		        produtos.add(p);
		    } else {
		    	System.out.println("------------------------- Eletronico ----------------------------");
		        Eletronico elt = new Eletronico();
		        System.out.println("Informe o ID do Eletronico: ");
				elt.setId(src.nextInt());
				src.nextLine();
				System.out.println("Informe o nome do Eletronico: ");
				elt.setNome(src.nextLine());
				System.out.println("Informe o preço do Eletronico: ");
				elt.setPreco(src.nextBigDecimal());
				System.out.println("Informe a Categoria do Eletronico: ");
				elt.setIdCategoria(src.nextInt());
				src.nextLine();
				System.out.println("Informe a Marca do Eletronico: ");
				elt.setMarca(src.nextLine());
				System.out.println("Informe a garantia de meses do Eletronico: ");
				elt.setGarantiaMeses(src.nextInt());
				src.nextLine();
				System.out.println("Informe a voltagem do Eletronico: ");
				elt.setVoltagem(src.nextLine());
				
		        produtos.add(elt);
		    }

		    System.out.println("Deseja cadastrar outro? (s/n)");
		    continuar = src.nextLine();
		}
		
		System.out.println("-------------------------- Listagem de Produtos com seu devidos calculos -----------------------------");
		
		for (Product ps : produtos) {
			System.out.println("Produto: "+ps.getNome());
			System.out.println("Preço Base: R$ "+ps.getPreco());
			
			System.out.println("Preço final (com regras): "+ps.calcularPrecoFinal());
		}
	}

}
