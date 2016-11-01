package dois;

public class TestaComparacaoConta {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();

		cc.deposita(1000);
		cp.deposita(1000);

		System.out.println(cc.equals(cp));
		
		
	}
}
