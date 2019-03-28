package main.java.interfaces

import main.java.modelo.Orcamento

interface IImposto {

    fun calcula(orcamento: Orcamento): Double
}
