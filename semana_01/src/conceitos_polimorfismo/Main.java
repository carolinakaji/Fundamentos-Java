package conceitos_polimorfismo;

public class Main {

	public static void main(String[] args) {
		
		Forma circ1 = new Circulo(4.3);
		System.out.println(circ1.calcularArea());
		
		Forma quadrado1 = new Quadrado(5.0);
		System.out.println(quadrado1.calcularArea());

	}

}
