package teste;

import org.junit.Assert;
import org.junit.Test;

import modelo.Orcamento;
import modelo.implementacao.imposto.ICCC;
import negocio.CalculadoraDeImpostos;

public class TesteCalculadora {

	@Test
	public void testItCCC() {

		Assert.assertTrue(25 == new CalculadoraDeImpostos().calcula(new Orcamento(500), new ICCC()));
	}
}
