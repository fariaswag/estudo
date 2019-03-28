package main.java.negocio

import main.java.interfaces.IImposto
import main.java.modelo.Orcamento

class CalculadoraDeImpostos {

    fun calcula(orcamento: Orcamento, imposto: IImposto): Double {

        return imposto.calcula(orcamento)
    }
}
