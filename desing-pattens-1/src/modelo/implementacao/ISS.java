package modelo.implementacao;

import interfaces.IImposto;
import modelo.Orcamento;

public class ISS implements IImposto {

	@Override
	public double calcula(Orcamento o) {

		return o.getValor() * 0.06;
	}

}
