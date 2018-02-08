package modelo.implementacao.desconto;

import interfaces.IDesconto;
import modelo.Orcamento;

public class DescontoVendaComLapisECaneta implements IDesconto {

	private IDesconto proximo;

	@Override
	public double calcula(Orcamento orcamento) {

		if (existeLapisOuCaneta(orcamento)) {
			return 0.05;
		}

		return proximo.calcula(orcamento);
	}

	private boolean existeLapisOuCaneta(Orcamento orcamento) {

		return buscaItem(orcamento, "lapis") && buscaItem(orcamento, "caneta");
	}

	private boolean buscaItem(Orcamento orcamento, String nomeItem) {

		return orcamento.getItens().stream().filter(item -> item.getNome().equalsIgnoreCase(nomeItem)).findAny().isPresent();
	}

	@Override
	public void setProximo(IDesconto desconto) {

		this.proximo = desconto;

	}

}
