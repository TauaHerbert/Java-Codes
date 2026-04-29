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
				areaGeometrica = calculandoQuadrado();
				resp = "Área do Quadrado = "+areaGeometrica.getArea();
			}else if (op == 2) {
				areaGeometrica = calculandoRetangulo();
				resp = "Área do Retângulo = "+areaGeometrica.getArea();
			}else if (op == 3) {
				areaGeometrica = calculandoCirculo();
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
	
	private static AreaGeometrica calculandoQuadrado() {
		System.out.println("Informe o tamanho dos lados do Quadrado: ");
		var vq = src.nextDouble();
		return new Quadrado(vq);
	}
	
	private static AreaGeometrica calculandoRetangulo() {
		System.out.println("Informe a base do Retângulo: ");
		var vrb = src.nextDouble();
		System.out.println("Informe a altura do Retângulo: ");
		var vra = src.nextDouble();
		return new Retangulo(vra, vrb);
	}
	
	private static AreaGeometrica calculandoCirculo() {
		System.out.println("Informe o raio do Círculo: ");
		var vc = src.nextDouble();
		return new Circulo(vc);
	}

}
