package conceitos_polimorfismo_veiculos_abastecer;

public class Caminhao extends Veiculo{
	
	Caminhao(){}

	@Override
	public void abastecer() {
		System.out.println("Abastecendo com diesel");
	}
}
