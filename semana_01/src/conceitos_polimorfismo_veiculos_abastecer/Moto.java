package conceitos_polimorfismo_veiculos_abastecer;

public class Moto extends Veiculo{
	
	Moto(){}

	@Override
	public void abastecer() {
		System.out.println("Abastecendo com gasolina");
	}
}
