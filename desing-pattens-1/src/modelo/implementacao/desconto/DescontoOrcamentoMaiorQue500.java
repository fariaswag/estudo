package modelo.implementacao.desconto;

import interfaces.IDesconto;
import modelo.Orcamento;

public class DescontoOrcamentoMaiorQue500 implements IDesconto {

	private IDesconto proximo;

	@Override
	public double calcula(Orcamento orcamento) {

		if (orcamento.getValor() > 500) {
			return 0.07;
		}
		return proximo.calcula(orcamento);
	}

	@Override
	public void setProximo(IDesconto desconto) {

		this.proximo = desconto;
	}
}
