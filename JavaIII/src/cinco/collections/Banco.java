package cinco.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dois.Conta;

public class Banco {

	List<Conta> contas = new ArrayList<>();
	Map<String, Conta> contasChaveadas = new HashMap<>();

	public void adiciona(Conta c) {
		contas.add(c);
		contasChaveadas.put(c.getNomeDoCliente(), c);
	}

	public Conta pega(int x) {
		return contas.get(x);
	}

	public int pegaQuantidadeDeContas() {
		return contas.size();
	}

	public Conta buscaPorNome(String nome){
		return contasChaveadas.get(nome);
	}
}
