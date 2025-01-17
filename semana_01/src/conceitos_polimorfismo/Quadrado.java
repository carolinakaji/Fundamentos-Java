package conceitos_polimorfismo;

public class Quadrado extends Forma {

	private double lado;
	
	Quadrado(double lado){
		this.lado = lado;
	}
	
	@Override
	public double calcularArea() {
		return lado*lado;
	}
}
