package CalculosGeometricos;

public record Retangulo(double base, double altura) implements AreaGeometrica{

	@Override
	public double getArea() {
		return base * altura;
	}
}
