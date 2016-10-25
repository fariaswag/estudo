package excecoes;

public class ValorInvalidoException extends RuntimeException {

	private double saldo;

	public ValorInvalidoException(double saldo) {
		super("Valor Inv�lido");
		this.saldo = saldo;

	}

	public double getSaldo() {
		return saldo;
	}
}
