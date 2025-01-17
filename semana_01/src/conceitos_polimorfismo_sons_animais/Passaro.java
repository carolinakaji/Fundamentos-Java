package conceitos_polimorfismo_sons_animais;

public class Passaro extends Animal{
	Passaro(){}

	@Override
	public void emitirSom() {
		System.out.println("O passaro faz: Piu Piu!");
	}
}
