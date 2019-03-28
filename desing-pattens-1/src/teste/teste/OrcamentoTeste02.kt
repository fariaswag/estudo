package teste

import main.java.interfaces.IDesconto
import main.java.modelo.Item
import main.java.modelo.Orcamento
import main.java.modelo.implementacao.desconto.DescontoMaisDeCincoItens
import main.java.modelo.implementacao.desconto.DescontoOrcamentoMaiorQue500
import main.java.modelo.implementacao.desconto.DescontoVendaComLapisECaneta
import main.java.modelo.implementacao.desconto.SemDesconto

class OrcamentoTeste02 {

    private var orcamento: Orcamento? = null

    @Test
    fun testaDecontoParaMaisDe5Itens() {

        orcamento = Orcamento(100.0)
        orcamento!!.adicionar(Item("CADERNO"))
        orcamento!!.adicionar(Item("LIVRO"))
        orcamento!!.adicionar(Item("BORRACHA"))
        orcamento!!.adicionar(Item("CANETA"))
        orcamento!!.adicionar(Item("PINCEL"))
        orcamento!!.adicionar(Item("GIZ"))
        Assert.assertTrue(0.1 == descontoMaisDeCincoItens!!.calcula(orcamento))
    }

    @Test
    fun testaDecontoParaOrcamentoMaiorQue500() {

        orcamento = Orcamento(1000.0)
        orcamento!!.adicionar(Item("CADERNO"))
        orcamento!!.adicionar(Item("LIVRO"))

        Assert.assertTrue(0.07 == descontoMaisDeCincoItens!!.calcula(orcamento))
    }

    @Test
    fun testaSemDesconto() {

        orcamento = Orcamento(10.0)
        orcamento!!.adicionar(Item("CADERNO"))
        orcamento!!.adicionar(Item("LIVRO"))

        Assert.assertTrue(0.0 == descontoMaisDeCincoItens!!.calcula(orcamento))
    }

    @Test
    fun testaDescontoVendaCasada() {

        orcamento = Orcamento(500.0)
        orcamento!!.adicionar(Item("LAPIS"))
        orcamento!!.adicionar(Item("CANETA"))

        Assert.assertTrue(0.05 == descontoMaisDeCincoItens!!.calcula(orcamento))
    }

    companion object {

        private var descontoMaisDeCincoItens: IDesconto? = null

        private var descontoOrcamentoMaiorQue500: IDesconto? = null

        private var semDesconto: IDesconto? = null

        private var descontoVendaComLapisECaneta: IDesconto? = null

        @BeforeClass
        fun configurar() {

            descontoMaisDeCincoItens = DescontoMaisDeCincoItens()
            descontoOrcamentoMaiorQue500 = DescontoOrcamentoMaiorQue500()
            descontoVendaComLapisECaneta = DescontoVendaComLapisECaneta()
            semDesconto = SemDesconto()
            descontoMaisDeCincoItens!!.setProximo(descontoOrcamentoMaiorQue500)
            descontoOrcamentoMaiorQue500!!.setProximo(descontoVendaComLapisECaneta)
            descontoVendaComLapisECaneta!!.setProximo(semDesconto)
        }
    }

}
