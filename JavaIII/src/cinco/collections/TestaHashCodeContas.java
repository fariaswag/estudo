package cinco.collections;

import java.util.HashSet;
import java.util.Set;

import dois.Conta;
import dois.ContaPoupanca;

public class TestaHashCodeContas {

	public static void main(String[] args) {

		Set<Conta> contas = new HashSet<>();
		contas.add(new ContaPoupanca(1, 1, "nomeDoCliente"));
		contas.add(new ContaPoupanca(1, 1, "nomeDoCliente"));
		contas.add(new ContaPoupanca(1, 1, "nomeDoCliente"));

		System.out.println(contas.size());
	}

}
