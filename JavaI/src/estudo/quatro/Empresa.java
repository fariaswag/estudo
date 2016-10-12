package estudo.quatro;

import estudo.tres.Funcionario;

public class Empresa {

	private String nome;
	private String cnpf;
	private Funcionario funcionarios[];
	private int posicaoLivreFuncionario = 0;

	public Empresa(int quantidadeDeFuncionarios) {
		this.funcionarios = new Funcionario[quantidadeDeFuncionarios];
	}

	public void adicionar(Funcionario funcionarioASerAdicionado) {

		funcionarios[posicaoLivreFuncionario++] = funcionarioASerAdicionado;
	}

	public void mostraEmpregados() {

		for (int i = 0; i < posicaoLivreFuncionario; i++) {
			System.out.println(funcionarios[i]);
		}
	}

	public boolean contem(Funcionario funcionarioProcurado) {

		Funcionario funcionario = null;

		for (int i = 0; i < posicaoLivreFuncionario; i++) {

			funcionario = funcionarios[i];
			if (funcionario == funcionarioProcurado) {
				return true;
			}
		}

		return false;
	}

	public Funcionario getFuncionario(int posicao) {
		return funcionarios[posicao];
	}
}
