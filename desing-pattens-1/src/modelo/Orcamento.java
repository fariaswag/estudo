package modelo;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {

	double valor;

	List<Item> itens = new ArrayList<>();

	public Orcamento(double valor) {

		this.valor = valor;
	}

	public double getValor() {

		return valor;
	}

	public List<Item> getItens() {

		return itens;
	}

	public void adicionar(Item item) {

		this.itens.add(item);
	}

	public void comValor(double valor) {

		this.valor = valor;

	}

}
