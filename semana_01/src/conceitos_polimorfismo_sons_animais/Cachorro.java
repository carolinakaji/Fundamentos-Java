package conceitos_polimorfismo_sons_animais;

public class Cachorro extends Animal{
	
	Cachorro(){}

	@Override
	public void emitirSom() {
		System.out.println("O cachorro faz: Au Au!");
	}
}
