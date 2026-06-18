package Exercicios;
import java.util.Iterator;
import java.util.Scanner;



public class Cinema {
	public static void main(String[] args) {
		
		
		String cine [][] = new String[10][10];
		String cineF [][] = new String[10][10];
		int lug, i1, i2;
		String lug1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------------==---CINEMA---==----------------------------");
		Cinema(cine,cineF);
		System.out.print("Escolha o sua cadeira: ");
		lug1 = sc.nextLine();
		
		while(!lug1.equals("sair")) {
		lug = Integer.parseInt(lug1);
		i1 = lug / 10;
		i2 = lug % 10;
		
		if (cineF[i1][i2] == "X") {
			System.out.println("Assento: "+lug1+" já está ocupado, escolha outro!");
		}
		for (int i = 0; i < cineF.length; i++) {
				for (int j = 0; j < cineF.length; j++) {
					if (cineF[i][j].equals(lug1)) {
						cineF[i][j] = "X";
						System.out.println("Assento "+lug1+" confirmado!");
						MatrizCine(cineF);
				}
			}
		}
		
		System.out.println("---------------------------==---CINEMA---==----------------------------");	
		System.out.println("Escolha o seu lugar!");
		lug1 = sc.nextLine();
		}
		System.out.println();
		MatrizCine(cineF);
		
		
	}
	
	public static void Cinema(String[][] cine, String[][] cineF) {
		int cont = 0;
		String val;
		
		for (int i = 0; i < cine.length; i++) {
			for (int j = 0; j < cine.length; j++) {
				val = Integer.toString(cont);
				if (i <= 0 && j <= 10) {
					cine[i][j] = val;
					cineF[i][j] = cine[i][j];
					System.out.print(cine[i][j]+"    ");
				}else {
					cine[i][j] = val;
					cineF[i][j] = cine[i][j];
					System.out.print(cine[i][j]+"  ");
				}
				cont++;
			}
		    System.out.println(" ");
		}
		cont = 0;
	}
	public static void MatrizCine(String[][] cineF) {
		   for (int i = 0; i < cineF.length; i++) {
			    for (int j = 0; j < cineF.length; j++) {
					System.out.print("  "+cineF[i][j]+"  ");
				}
			    System.out.println();
		   }
	   }
		

}
