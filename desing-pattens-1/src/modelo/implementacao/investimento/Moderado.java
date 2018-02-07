package modelo.implementacao.investimento;

import java.util.Random;

import interfaces.IInvestimento;
import modelo.ContaBancaria;

public class Moderado implements IInvestimento {

	@Override
	public double calculaLucro(ContaBancaria contaBancaria) {
		
		if (new Random().nextDouble() > 0.5) {
			return 2.5;
		}
		return contaBancaria.getSaldo();  
	}

}
