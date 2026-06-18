package Exercicios;
import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		float num1, num2, med;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Informe a primeira nota: ");
			num1 = sc.nextFloat();
			System.out.println("Informe a segunda nota: ");
			num2 = sc.nextFloat();
			
			med = num1 + num2;
			
			if (med <= 6) {
				System.out.println("Aluno em recuperação! ");
			}else {
				System.out.println("Aluno aprovado! ");
			}
			
			System.out.println("Resultado da soma: "+med);
		}catch (Exception e) {
			System.out.println("Erro no código: "+e.getMessage());
		}
		
		
	}

}
