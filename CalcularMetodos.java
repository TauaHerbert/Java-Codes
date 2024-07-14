package Class1;

public class CalcularMetodos {
	
    //Somar 	
	int somar(int a ,int b) {
		return a + b;
	}
	
	int somar(int a ,int b, int c) {
		return a + b + c;
	}
	
	//Subtrair
	int subtrair(int a ,int b) {
		return a - b;
	}
	
	int subtrair(int a ,int b, int c) {
		return a - b - c;
	}
	
	//Multiplicar
	double multiplicar(double a ,double b) {
		return a * b;
	}
	
	double multiplicar(double a ,double b, double c) {
		return a * b * c;
	}
	
	//Dividir
	double divisao(double a ,double b) {
		double div = 0;
		if (a == 0 || b == 0 ) {
			System.out.println("Divisão invalida");
		}else {
			div = a / b;	
		}
		return div;
	}
	
	double divisao(double a ,double b, double c) {
		double div = 0;
		if (a == 0 || b == 0 || c ==0) {
			System.out.println("Divisão invalida");
		}else {
			div = a / b / c;
		}
		return div;
	}

}
