package estudo.cinco;

import estudo.tres.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario jose = new Funcionario("Jose");
		jose.setSalario(1000.0);
		jose.setLimite(110.0);
		System.out.println(jose.getIdentificador());

		Funcionario pedro = new Funcionario("Pedro");
		pedro.setSalario(1000.0);
		pedro.setLimite(110.0);
		System.out.println(pedro.getIdentificador());

		Funcionario f = new Funcionario("Pedro");
		f.setSalario(1000.0);
		f.setLimite(110.0);
		System.out.println(f.getIdentificador());
	}
}
