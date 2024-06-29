package Class1;
import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		try {
			
			Scanner input = new Scanner(System.in);
			char resposta;
			int cont = 0;
			
			menu();
			System.out.println("Telefonou para vítima? ");
			resposta = input.next().charAt(0);
			while(!(resposta == '1' || resposta == '2')) {
				System.out.println("Resposta invalida! Tente novamente.");
				menu();
				System.out.println("Telefonou para vítima? ");
				resposta = input.next().charAt(0);
			}
			if(resposta == '1'){
				cont++;
			}
			
			menu();
			System.out.println("Esteve no local do crime? ");
			resposta = input.next().charAt(0);
			while(!(resposta == '1' || resposta == '2')) {
				System.out.println("Resposta invalida! Tente novamente.");
				menu();
				System.out.println("Esteve no local do crime? ");
				resposta = input.next().charAt(0);
			}
			if(resposta == '1'){
				cont++;
			}
			
			menu();
			System.out.println("Mora perto da vítima? ");
			resposta = input.next().charAt(0);
			while(!(resposta == '1' || resposta == '2')) {
				System.out.println("Resposta invalida! Tente novamente.");
				menu();
				System.out.println("Mora perto da vítima? ");
				resposta = input.next().charAt(0);
			}
			if(resposta == '1'){
				cont++;
			}
			
			menu();
			System.out.println("Devia para vítima? ");
			resposta = input.next().charAt(0);
			while(!(resposta == '1' || resposta == '2')) {
				System.out.println("Resposta invalida! Tente novamente.");
				menu();
				System.out.println("Devia para vítima? ");
				resposta = input.next().charAt(0);
			}
			if(resposta == '1'){
				cont++;
			}
			
			menu();
			System.out.println("Já trabalhou com a vítima? ");
			resposta = input.next().charAt(0);
			while(!(resposta == '1' || resposta == '2')) {
				System.out.println("Resposta invalida! Tente novamente.");
				menu();
				System.out.println("Já trabalhou com a vítima? ");
				resposta = input.next().charAt(0);
			}
			if(resposta == '1'){
				cont++;
			}
			
			if(cont == 2) {
				System.out.println("Suspeita");
			}else if(cont > 2 && cont <= 4) {
				System.out.println("Cúmplice");
			}else if(cont > 4){
				System.out.println("Assassino(a)");
			}else {
				System.out.println("Inocente");
			}
			
			
		} catch (Exception ex) {
			System.out.println("Error em alguma parte do código: "+ex.getMessage());
		}
		
	}
	
	public static void menu(){
		System.out.println("Responda: ");
		System.out.println("[1] Sim");
		System.out.println("[2] Não");
	}

}
