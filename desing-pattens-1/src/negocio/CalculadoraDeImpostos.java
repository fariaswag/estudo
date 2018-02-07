package negocio;

import interfaces.IImposto;
import modelo.Orcamento;

public class CalculadoraDeImpostos {

	public void calcula(Orcamento orcamento, IImposto imposto) {

		System.out.println(imposto.calcula(orcamento));
	}
}
