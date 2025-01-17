package conceitos_polimorfismo_sistema_pagamentos;

public class PagamentoCartao extends Pagamento{

	@Override
	public void realizarPagamento(){
		System.out.println("Pagamento realizado com Cartão");
	}
}
