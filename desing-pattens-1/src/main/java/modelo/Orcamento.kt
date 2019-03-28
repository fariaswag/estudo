package main.java.modelo

import java.util.ArrayList

class Orcamento(valor: Double) {

    var valor: Double = 0.toDouble()
        internal set

    internal var itens: MutableList<Item> = ArrayList()

    init {

        this.valor = valor
    }

    fun getItens(): List<Item> {

        return itens
    }

    fun adicionar(item: Item) {

        this.itens.add(item)
    }

    fun comValor(valor: Double) {

        this.valor = valor

    }

}
