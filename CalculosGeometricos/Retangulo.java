package CalculosGeometricos;

public record Retangulo(double altura, double base) implements AreaGeometrica{

	@Override
	public double getArea() {
		return base * altura;
	}
}
