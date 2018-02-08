package modelo.implementacao.desconto;

import interfaces.IDesconto;
import modelo.Orcamento;

public class SemDesconto implements IDesconto {

	@Override
	public double calcula(Orcamento orcamento) {

		return 0;
	}

	@Override
	public void setProximo(IDesconto desconto) {

	}

}
