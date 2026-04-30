package CalculosGeometricos;
import java.util.Scanner;

public class Main {
	
	private final static Scanner src = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		AreaGeometrica areaGeometrica;
		String resp;
		int op;
		
		while (true) {
			
			System.out.println("Escolha a forma Geometrica que deseja calcular a área: ");
			System.out.println("( 1 ) para Quadrado");
			System.out.println("( 2 ) para Retângulo");
			System.out.println("( 3 ) para Círculo");
			System.out.println("( 4 ) para encerrar o programa");
			op = src.nextInt();
			
			if (op == 1) {
				
				System.out.println("Informe o tamanho dos lados do Quadrado: ");
				var lado = src.nextDouble();
				
				areaGeometrica = () -> lado * lado;
				
				resp = "Área do Quadrado = "+areaGeometrica.getArea();
			
			}else if (op == 2) {
				
				System.out.println("Informe a base do Retângulo: ");
				var base = src.nextDouble();
				System.out.println("Informe a altura do Retângulo: ");
				var altura = src.nextDouble();
				
				areaGeometrica = () -> base * altura;
				
				resp = "Área do Retângulo = "+areaGeometrica.getArea();
				
			}else if (op == 3) {
				
				System.out.println("Informe o raio do Círculo: ");
				var raio = src.nextDouble();
				
				areaGeometrica = () -> Math.PI * (raio * raio);
				
				resp = "Área do Círculo = "+areaGeometrica.getArea();
				
			}else if (op == 4){
				System.out.println("Programa encerrado!");
				break;
			}else {
				System.out.println("Opção incorreta!");
				continue;
			}
			System.out.println("Resultado do cálculo: "+resp);
		}
	}
}
