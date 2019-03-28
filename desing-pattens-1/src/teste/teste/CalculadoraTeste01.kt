package teste

import main.java.modelo.Orcamento
import main.java.modelo.implementacao.imposto.ICCC
import main.java.negocio.CalculadoraDeImpostos
import org.junit.Assert
import org.junit.Test

class CalculadoraTeste01 {

    @Test
    fun testItCCC() {

        Assert.assertTrue(25.0 == CalculadoraDeImpostos().calcula(Orcamento(500.0), ICCC()))
    }
}
