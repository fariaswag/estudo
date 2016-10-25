package seis.excecoes;

import dois.Conta;
import dois.ContaCorrente;
import excecoes.ValorInvalidoException;

public class TesteDeposita {

	public static void main(String[] args) {
		Conta cp = new ContaCorrente();
		try {
			cp.deposita(-100);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}

		String[] ss = new String[Integer.MAX_VALUE];
	}
}
