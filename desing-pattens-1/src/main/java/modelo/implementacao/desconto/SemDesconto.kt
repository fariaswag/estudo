package main.java.modelo.implementacao.desconto

import main.java.interfaces.IDesconto
import main.java.modelo.Orcamento

class SemDesconto : IDesconto {

    override fun calcula(orcamento: Orcamento): Double {

        return 0.0
    }

    override fun setProximo(desconto: IDesconto) {

    }

}
