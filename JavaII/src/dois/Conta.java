package dois;

public abstract class Conta {

	protected double saldo;
	protected String descricao;

	public double getSaldo() {
		return this.saldo;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public abstract void atualiza(double taxa);

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
