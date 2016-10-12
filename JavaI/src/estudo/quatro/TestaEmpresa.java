package estudo.quatro;

import estudo.tres.Data;
import estudo.tres.Funcionario;

public class TestaEmpresa {

	public static void main(String[] args) {

		Data data = new Data(11,2,2016);

		Funcionario fulano = new Funcionario("Fulano de tal");

		fulano.setDataEntradaBanco(data);
		fulano.setDepartamento("Administrativo");
		fulano.setRg("223333");
		fulano.setSalario(3000);

		Funcionario beltrano = new Funcionario("Beltrano");
		beltrano.setDataEntradaBanco(data);
		beltrano.setDepartamento("Financeiro");
		beltrano.setRg("223333");
		beltrano.setSalario(3000);

		Empresa farias = new Empresa(10);
		farias.adicionar(beltrano);
		farias.adicionar(fulano);

		farias.mostraEmpregados();
	}

}
