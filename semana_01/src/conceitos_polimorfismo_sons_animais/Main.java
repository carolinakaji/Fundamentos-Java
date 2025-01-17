package conceitos_polimorfismo_sons_animais;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Animal> animais = new ArrayList<>();
		animais.add(new Cachorro());
		animais.add(new Gato());
		animais.add(new Passaro());
		
		for(Animal animal: animais) {
			animal.emitirSom();
		}

	}

}