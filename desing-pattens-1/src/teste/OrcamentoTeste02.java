package teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import interfaces.IDesconto;
import modelo.Item;
import modelo.Orcamento;
import modelo.implementacao.desconto.DescontoMaisDeCincoItens;
import modelo.implementacao.desconto.DescontoOrcamentoMaiorQue500;
import modelo.implementacao.desconto.DescontoVendaComLapisECaneta;
import modelo.implementacao.desconto.SemDesconto;

public class OrcamentoTeste02 {

	private static IDesconto descontoMaisDeCincoItens;

	private static IDesconto descontoOrcamentoMaiorQue500;

	private Orcamento orcamento;

	private static IDesconto semDesconto;

	private static IDesconto descontoVendaComLapisECaneta;

	@BeforeClass
	public static void configurar() {

		descontoMaisDeCincoItens = new DescontoMaisDeCincoItens();
		descontoOrcamentoMaiorQue500 = new DescontoOrcamentoMaiorQue500();
		descontoVendaComLapisECaneta = new DescontoVendaComLapisECaneta();
		semDesconto = new SemDesconto();
		descontoMaisDeCincoItens.setProximo(descontoOrcamentoMaiorQue500);
		descontoOrcamentoMaiorQue500.setProximo(descontoVendaComLapisECaneta);
		descontoVendaComLapisECaneta.setProximo(semDesconto);
	}

	@Test
	public void testaDecontoParaMaisDe5Itens() {

		orcamento = new Orcamento(100);
		orcamento.adicionar(new Item("CADERNO"));
		orcamento.adicionar(new Item("LIVRO"));
		orcamento.adicionar(new Item("BORRACHA"));
		orcamento.adicionar(new Item("CANETA"));
		orcamento.adicionar(new Item("PINCEL"));
		orcamento.adicionar(new Item("GIZ"));
		Assert.assertTrue(0.1 == descontoMaisDeCincoItens.calcula(orcamento));
	}

	@Test
	public void testaDecontoParaOrcamentoMaiorQue500() {

		orcamento = new Orcamento(1000);
		orcamento.adicionar(new Item("CADERNO"));
		orcamento.adicionar(new Item("LIVRO"));

		Assert.assertTrue(0.07 == descontoMaisDeCincoItens.calcula(orcamento));
	}

	@Test
	public void testaSemDesconto() {

		orcamento = new Orcamento(10);
		orcamento.adicionar(new Item("CADERNO"));
		orcamento.adicionar(new Item("LIVRO"));

		Assert.assertTrue(0 == descontoMaisDeCincoItens.calcula(orcamento));
	}

	@Test
	public void testaDescontoVendaCasada() {

		orcamento = new Orcamento(500);
		orcamento.adicionar(new Item("LAPIS"));
		orcamento.adicionar(new Item("CANETA"));

		Assert.assertTrue(0.05 == descontoMaisDeCincoItens.calcula(orcamento));
	}

}
