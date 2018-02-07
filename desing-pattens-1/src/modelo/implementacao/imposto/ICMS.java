package modelo.implementacao.imposto;

import interfaces.IImposto;
import modelo.Orcamento;

public class ICMS implements IImposto {

	@Override
	public double calcula(Orcamento o) {

		return o.getValor() * 0.05 + 50;
	}

}
