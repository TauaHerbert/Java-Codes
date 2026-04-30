package CalculosGeometricos;

public record Circulo(double raio) implements AreaGeometrica{

	private static final double pi = 3.14;
	
	@Override
	public double getArea() {
		return Math.PI * (raio * raio);
	}
}
