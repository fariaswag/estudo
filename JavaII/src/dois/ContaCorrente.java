package dois;

import inteface.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}

	@Override
	public double calculaTributos() {
		return this.saldo * 0.01;
	}
	
	@Override
	public double getSaldo() {
		return this.saldo;
	}

}
