package Exercicios;
import java.util.Scanner;
public class Mercadinho {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String alimentos[] = new String[2];
		float prealiemnto[] = new float[2];
		String nome;
		float preco = 0;
		float total, ftotal = 0;
		int num = 0;
		int uni;
		boolean va = false;
		
		System.out.println("---------------------Mercadinho---------------------");
		System.out.println("Cadastro de aliemntos");
		for (int i = 0; i < alimentos.length; i++) {
			System.out.println("Insira o nome do alimento: ");
			nome = sc.nextLine();
			while (nome.equals("")) {
				System.out.println("Nome do alimento vazio!");
				System.out.println("Insira o nome do alimento: ");
				nome = sc.nextLine();
			}
			while(!va) {
				try {
					System.out.println("Insira o valor do alimento ["+nome+"] : ");
					preco = sc.nextFloat();
					va = true;
				} catch (Exception e) {
					System.out.println("Valor do alimento incorreto!");
					sc.next();
				}
			}
			System.out.println("Alimento cadastrado com sucesso: "+nome+" - R$ "+preco);
			va = false;
			sc.nextLine().equals(nome);
			alimentos[i] = nome;
			prealiemnto[i] = preco;
			System.out.println("---------------------Mercadinho---------------------");
		}
		System.out.println("----------------Tabela do Mercadinho ----------------");
		for (int i = 0; i < alimentos.length; i++) {
			System.out.println(i+" : "+alimentos[i]+" R$ "+prealiemnto[i]);
		}
		
		while (true) {
			System.out.println("Escolha os seus itens pela numeração ou digite [10] para encerrar: ");
			num = sc.nextInt();
			if (num == 10) {
				break;
			}
            System.out.println(alimentos[num]);
            System.out.println("Quantas unidades? ");
            uni = sc.nextInt();
            total = uni * prealiemnto[num];
            ftotal = ftotal + total;
		}
		
		System.out.println("Total da compra: "+ftotal);
	}//main

}
