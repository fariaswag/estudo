package main.java.modelo.implementacao.imposto

import main.java.interfaces.IImposto
import main.java.modelo.Orcamento

class ICCC : IImposto {

    override fun calcula(orcamento: Orcamento): Double {

        val valor = orcamento.valor
        if (valor < 1000) {
            return valor * 0.05
        } else if (valor <= 3000) {
            return valor * 0.07
        }
        return valor * 0.08 + 30
    }

}
