package dois;

public class AtualizadorDeContas {

	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public void roda(Conta conta) {

		System.out.println("Saldo Anterior = " + conta.getSaldo());
		conta.atualiza(selic);
		System.out.println("Saldo Final=" + conta.getSaldo());
		this.saldoTotal += conta.getSaldo();
	}

	public double getSaldoTotal() {
		return saldoTotal;
	}
}
