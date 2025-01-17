package conceitos_polimorfismo_veiculos_abastecer;

public class Carro extends Veiculo{
	
	Carro(){}

	@Override
	public void abastecer() {
		System.out.println("Abastecendo com gasolina ou etanol");
	}
}
