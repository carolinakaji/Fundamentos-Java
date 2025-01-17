package conceitos_polimorfismo_veiculos_abastecer;

public class Main {

	public static void main(String[] args) {

		Veiculo carro = new Carro();
		Veiculo moto = new Moto();
		Veiculo caminhao = new Caminhao();
		
		carro.abastecer();
		moto.abastecer();
		caminhao.abastecer();

	}

}
