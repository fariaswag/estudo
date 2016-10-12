package cinco;

import inteface.Tributavel;

public class SeguroDeVida implements Tributavel {

	@Override
	public double calculaTributos() {
		return 42;
	}

}
