package conceitos_polimorfismo_sistema_pagamentos;

public class PagamentoPix extends Pagamento{

	@Override
	public void realizarPagamento() {
		System.out.println("Pagamento realizado via Pix");
	}
}
