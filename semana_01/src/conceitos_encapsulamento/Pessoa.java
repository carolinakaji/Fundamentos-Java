package conceitos_encapsulamento;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	Pessoa(){}
	
	// getter
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}

	//setter
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
