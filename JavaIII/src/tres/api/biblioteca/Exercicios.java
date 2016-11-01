package tres.api.biblioteca;

public class Exercicios {

	public static void main(String[] args) {

		String s = "! fj11  tem espaço em branco nas pontas ";
		System.out.println(s.replaceAll("1", "2"));

		System.out.println("Contem 'j'? = " + s.contains("j"));
		System.out.println(" Retirando Espaços em Branco Inicio e Fim ".trim());
		System.out.println("Esta Vazia ? = " + s.isEmpty());
		System.out.println(s.length());

		System.out.println("#################");
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}

		System.out.println("#################");
		s = "Socorram-me, subi no ônibus em Marrocos";
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}

		System.out.println("\n################# reverse	");
		StringBuilder str = new StringBuilder("anotaram a data da maratona");
		System.out.print(str.reverse());
		System.out.println("");
		s = "Socorram-me, subi no ônibus em Marrocos";
		String[] novaString = s.split(" ");
		for (int i = novaString.length - 1; i >= 0; i--) {
			System.out.print(novaString[i] + " ");
		}

		System.out.println("Converter para int");

		String numero = "762";
		System.out.println("Imprimindo a string: " + numero);

		int resultado = converteParaInt(numero);
		System.out.println("Imprimindo o int: " + resultado);

	}

	private static int converteParaInt(String numero) {
		int resultado = 0;
		while (numero.length() > 0) {
			char algarismo = numero.charAt(0);
			resultado = resultado * 10 + (algarismo - '0');
			System.out.println((algarismo - '0'));
			numero = numero.substring(1);
		}
		return resultado;
	}
}
