package main.java.modelo.implementacao.imposto

import main.java.interfaces.IImposto
import main.java.modelo.Orcamento

class ICMS : IImposto {

    override fun calcula(o: Orcamento): Double {

        return o.valor * 0.05 + 50
    }

}
