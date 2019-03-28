package main.java.modelo.implementacao.desconto

import main.java.interfaces.IDesconto
import main.java.modelo.Orcamento

class DescontoOrcamentoMaiorQue500 : IDesconto {

    private var proximo: IDesconto? = null

    override fun calcula(orcamento: Orcamento): Double {

        return if (orcamento.valor > 500) {
            0.07
        } else proximo!!.calcula(orcamento)
    }

    override fun setProximo(desconto: IDesconto) {

        this.proximo = desconto
    }
}
