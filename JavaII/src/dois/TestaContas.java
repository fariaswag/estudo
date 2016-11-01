package dois;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TestaContas {

	public static void main(String[] args) {

		List<ContaPoupanca> contas = new LinkedList<>();

		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			contas.add(new ContaPoupanca(random.nextInt(100), random.nextDouble(), new String("CLiente" + i)));
		}

		Collections.sort(contas);
		System.out.println(contas);
		Collections.reverse(contas);
		System.out.println("Reverse = " + contas);
		Collections.shuffle(contas);
		System.out.println("Embaralhar = " + contas);
		Collections.rotate(contas, 1);
		System.out.println("Rotacionando em 1  = " + contas);

	}
}
