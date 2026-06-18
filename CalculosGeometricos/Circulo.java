package CalculosGeometricos;

public record Circulo(double raio) implements AreaGeometrica{

	@Override
	public double getArea() {
		return Math.PI * (raio * raio);
	}
}
