package Exercicios;

public class ExecLogic2 {
	public static void main(String[] args) {
		String [][] tab = new String[9][22];
		
		for (int a = 0; a <= 8; a++) {
			for (int b = 0; b <= 21; b++) {
				if(a == 2 && b == 1) {
					tab[a][b] = " 0 ";	
				}else if (a == 2 && b == 2) {
					tab[a][b] = " 0 ";	
				}else if (a == 2 && b == 3) {
					tab[a][b] = " 0 ";	
				}else if (a == 3 && b == 2) {
					tab[a][b] = " 0 ";	
				}else if (a == 4 && b == 2) {
					tab[a][b] = " 0 ";	
				}else if (a == 5 && b == 2) {
					tab[a][b] = " 0 ";	
					//fim da letra T
				}else if (a == 2 && b == 5) {
					tab[a][b] = " 0 ";	
				}else if (a == 3 && b == 5) {
					tab[a][b] = " 0 ";	
				}else if (a == 4 && b == 5) {
					tab[a][b] = " 0 ";	
				}else if (a == 5 && b == 5) {
					tab[a][b] = " 0 ";	
				}else if (a == 2 && b == 6) {
					tab[a][b] = " 0 ";	
				}else if (a == 2 && b == 7) {
					tab[a][b] = " 0 ";	
				}else if (a == 4 && b == 6) {
					tab[a][b] = " 0 ";	
				}else if (a == 3 && b == 7) {
					tab[a][b] = " 0 ";	
				}else if (a == 4 && b == 7) {
					tab[a][b] = " 0 ";	
				}else if (a == 5 && b == 7) {
					tab[a][b] = " 0 ";	
					//Fim da letra A
				}else if (a == 2 && b == 9) {
					tab[a][b] = " 0 ";	
				}else if (a == 3 && b == 9) {
					tab[a][b] = " 0 ";	
				}else if (a == 4 && b == 9) {
					tab[a][b] = " 0 ";	
				}else if (a == 5 && b == 9) {
					tab[a][b] = " 0 ";	
				}else if (a == 5 && b == 10) {
					tab[a][b] = " 0 ";	
				}else if (a == 5 && b == 11) {
					tab[a][b] = " 0 ";	
				}else if (a == 4 && b == 11) {
					tab[a][b] = " 0 ";	
				}else if (a == 3 && b == 11) {
					tab[a][b] = " 0 ";	
				}else if (a == 2 && b == 11) {
					tab[a][b] = " 0 ";	
					//Fim da letra U
				}else if (a == 2 && b == 13) {
					tab[a][b] = " 0 ";	
				}else if (a == 2 && b == 14) {
					tab[a][b] = " 0 ";	
				}else if (a == 2 && b == 15) {
					tab[a][b] = " 0 ";	
				}else if (a == 3 && b == 13) {
					tab[a][b] = " 0 ";	
				}else if (a == 3 && b == 15) {
					tab[a][b] = " 0 ";	
				}else if (a == 4 && b ==13) {
					tab[a][b] = " 0 ";	
				}else if (a == 4 && b == 14) {
					tab[a][b] = " 0 ";	
				}else if (a == 4 && b == 15) {
					tab[a][b] = " 0 ";	
				}else if (a == 5 && b == 13) {
					tab[a][b] = " 0 ";	
				}else if (a == 5 && b == 15) {
					tab[a][b] = " 0 ";	
					//Fim da letra A
				}else if (a == 1 && b == 12) {
					tab[a][b] = " º ";	
				}else if (a == 1 && b == 13) {
					tab[a][b] = " º ";	
				}else if (a == 1 && b == 14) {
					tab[a][b] = " º ";	
				}else if (a == 1 && b == 15) {
					tab[a][b] = " º ";	
				}else if (a == 1 && b == 16) {
					tab[a][b] = " º ";
					//Fim do ~ = ---
				}else {
					tab[a][b] = " + ";	
				}
				
			}
			
		}
		for (int c = 0; c <= 8; c++) {
			for (int d = 0; d <= 21; d++) {
				System.out.print(tab[c][d]);
			}
			System.out.println();
		}
	}

}
