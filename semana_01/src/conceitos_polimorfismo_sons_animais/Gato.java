package conceitos_polimorfismo_sons_animais;

public class Gato extends Animal{
	
	Gato(){}
	
	@Override
	public void emitirSom() {
		System.out.println("O gato faz: Miau!");
	}

}
