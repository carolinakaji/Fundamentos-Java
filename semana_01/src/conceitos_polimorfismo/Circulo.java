package conceitos_polimorfismo;

public class Circulo extends Forma{
	
	private double raio;

	Circulo(double raio){
		this.raio = raio;
	}
	
	@Override
	public double calcularArea() {
		return Math.PI*Math.pow(raio, 2);
	}
}
