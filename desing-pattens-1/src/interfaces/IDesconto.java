package interfaces;

import modelo.Orcamento;

public interface IDesconto {

	public double calcula(Orcamento orcamento);

	void setProximo(IDesconto desconto);
}
