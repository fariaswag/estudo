package dois;

import excecoes.ValorInvalidoException;

public abstract class Conta {

	protected double saldo;
	protected String descricao;
	private int numero;
	private String nomeDoCliente;

	public double getSaldo() {
		return this.saldo;
	}

	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}

	public String getNomeDoCliente() {
		return nomeDoCliente;
	}

	public void deposita(double valor) {
		if (valor < 0) {
			throw new ValorInvalidoException(saldo);
		}
		this.saldo += valor;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public abstract void atualiza(double taxa);

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {

		this.numero = numero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Numero =" + numero + " Nome do Cliente = " + this.getNomeDoCliente();
	}

}
