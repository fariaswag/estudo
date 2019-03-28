package main.java.interfaces

import main.java.modelo.Orcamento

interface IDesconto {

    fun calcula(orcamento: Orcamento): Double

    fun setProximo(desconto: IDesconto)
}
