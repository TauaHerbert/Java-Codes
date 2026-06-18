package Exercicios;

import ClassePessoa.Pessoa;

public class ExecLogica1 {
	public static void main(String[] args) {

		for (int i = 1 ; i <= 10; i++) {
			for (int a = 1; a <= i; a++) {
				System.out.print("+");
			}
			System.out.println(" ");
		}
		
		for (int b = 9; b >= 0; b--) {
			for (int c = 1; c <= b; c++) {
				System.out.print("+");
			}
			System.out.println(" ");
		}
	}
	
	final Pessoa pessoa = new Pessoa();

}
