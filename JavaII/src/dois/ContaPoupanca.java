package dois;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {

	public ContaPoupanca() {
	}

	public ContaPoupanca(int numero, double valor) {
		this.setNumero(numero);
		this.deposita(valor);
	}

	public ContaPoupanca(int numero, double valor, String nomeDoCliente) {
		this.setNumero(numero);
		this.deposita(valor);
		this.setNomeDoCliente(nomeDoCliente);
	}
	
	@Override
	public void deposita(double valor) {
		this.saldo += (valor - 0.1);
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}

	@Override
	public int compareTo(ContaPoupanca outra) {
		return this.getNomeDoCliente().compareTo(outra.getNomeDoCliente());
	}

}
