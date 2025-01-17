package conceitos_polimorfismo_sistema_pagamentos;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Pagamento> pagamentos = new ArrayList<>();
		pagamentos.add(new PagamentoCartao());
		pagamentos.add(new PagamentoPix());
		
		for(Pagamento pagamento: pagamentos) {
			pagamento.realizarPagamento();
		}

	}

}
