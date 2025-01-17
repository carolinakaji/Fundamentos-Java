package conceitos_encapsulamento;

public class Main {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("John");
		pessoa1.setIdade(33);
		
		System.out.println("Nome: " + pessoa1.getNome() + " - Idade: " + pessoa1.getIdade());
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Luna");
		pessoa2.setIdade(30);
		
		System.out.println("Nome: " + pessoa2.getNome() + " - Idade: " + pessoa2.getIdade());
	}

}
