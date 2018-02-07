package negocio;

import interfaces.IImposto;
import modelo.Orcamento;

public class CalculadoraDeImpostos {

	public double calcula(Orcamento orcamento, IImposto imposto) {

		return imposto.calcula(orcamento);
	}
}
