package main.java.modelo.implementacao.desconto

import main.java.interfaces.IDesconto
import main.java.modelo.Orcamento

class DescontoMaisDeCincoItens : IDesconto {

    internal var proximo: IDesconto

    override fun calcula(orcamento: Orcamento): Double {

        return if (orcamento.itens.size > 5) {
            0.1
        } else proximo.calcula(orcamento)
    }

    @override fun setProximo(desconto: IDesconto) {

        proximo = desconto
    }
}
