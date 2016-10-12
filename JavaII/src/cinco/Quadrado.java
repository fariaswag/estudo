package cinco;

import inteface.AreaCalculavel;

public class Quadrado implements AreaCalculavel {

	private int lado;

	public Quadrado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calculaArea() {
		return lado * lado;
	}

}
