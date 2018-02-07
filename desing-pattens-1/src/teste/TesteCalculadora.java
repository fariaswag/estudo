package teste;

import modelo.Orcamento;
import modelo.implementacao.ICCC;
import negocio.CalculadoraDeImpostos;

public class TesteCalculadora {

	public static void main(String[] args) {

		new CalculadoraDeImpostos().calcula(new Orcamento(500), new ICCC());
	}
}
