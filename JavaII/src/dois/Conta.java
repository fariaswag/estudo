package dois;

public class Conta {

	private double saldo;
	private String descricao;

	public double getSaldo() {
		return this.saldo;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
