package main.java.modelo.implementacao.desconto

import main.java.interfaces.IDesconto
import main.java.modelo.Orcamento

class DescontoVendaComLapisECaneta : IDesconto {

    private var proximo: IDesconto? = null

    override fun calcula(orcamento: Orcamento): Double {

        return if (existeLapisOuCaneta(orcamento)) {
            0.05
        } else proximo!!.calcula(orcamento)

    }

    private fun existeLapisOuCaneta(orcamento: Orcamento): Boolean {

        return buscaItem(orcamento, "lapis") && buscaItem(orcamento, "caneta")
    }

    private fun buscaItem(orcamento: Orcamento, nomeItem: String): Boolean {

        return orcamento.itens.stream().filter { item -> item.nome.equals(nomeItem, ignoreCase = true) }.findAny().isPresent
    }

    override fun setProximo(desconto: IDesconto) {

        this.proximo = desconto

    }

}
