package modelo.implementacao.desconto;

import interfaces.IDesconto;
import modelo.Orcamento;

public class DescontoMaisDeCincoItens implements IDesconto {

	IDesconto proximo;

	@Override
	public double calcula(Orcamento orcamento) {

		if (orcamento.getItens().size() > 5) {
			return 0.1;
		}
		return proximo.calcula(orcamento);
	}

	@Override
	public void setProximo(IDesconto desconto) {

		proximo = desconto;
	}
}
