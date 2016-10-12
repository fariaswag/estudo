package estudo.tres;

public class Funcionario {

	private String nome;
	private double salario;
	private Data dataEntradaBanco;
	private String rg;
	private String departamento;
	private double saldo;
	private double limite;
	private static int identificador;

	public Funcionario(String nome) {
		identificador++;
		this.nome = nome;
	}

	void recebeAumento(double aumento) {
		this.salario += aumento;
	}

	double calculaGanhoAtual() {
		return this.salario * 12;
	}

	public static void main(String[] args) {
		Data data = new Data(11, 2, 2016);
		Funcionario fulano = new Funcionario("Fulano de tal");

		fulano.dataEntradaBanco = data;
		fulano.departamento = "Administrativo";
		fulano.rg = "223333";
		fulano.salario = 3000;

		Funcionario beltrano = new Funcionario("Ciclano");
		beltrano.dataEntradaBanco = data;
		beltrano.departamento = "Administrativo";
		beltrano.rg = "223333";
		beltrano.salario = 3000;

		System.out.println(fulano);
		fulano.recebeAumento(100);
		System.out.println(fulano);

		if (fulano == beltrano) {
			System.out.println("São iguais");
		} else {
			System.out.println("São Diferentes");
		}

	}

	public void setSalario(double novoSalario) {
		this.salario = novoSalario;
	}

	public void setLimite(double novoLimite) {
		this.limite = novoLimite;
	}

	@Override
	public String toString() {
		StringBuffer funcionario = new StringBuffer();
		funcionario.append("Nome= " + this.nome);
		funcionario.append("\nData Entrada do Banco= " + this.dataEntradaBanco);
		funcionario.append("\nDepartamento= " + this.departamento);
		funcionario.append("\nRG= " + this.rg);
		funcionario.append("\nSalario= " + this.salario);
		funcionario.append("\nGanho Atual= " + this.calculaGanhoAtual());

		return funcionario.toString();
	}

	public void setDataEntradaBanco(Data data) {
		this.dataEntradaBanco = data;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void getGanhoAtual() {
		System.out.println(this.salario);
	}

	public int getIdentificador(){
		return identificador;
	}
}
