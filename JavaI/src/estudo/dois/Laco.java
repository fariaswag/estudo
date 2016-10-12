package estudo.dois;

import java.math.BigDecimal;

public class Laco {

	public static void main(String[] args) {
		lacoNaoAlcanca300();
		imprimeSomaDe1Ate1000();
		imprimeMultiplusDe3();
		fatorialDe1A10();
		exercicio8();

	}

	private static void exercicio8() {

		int x = 13;
		while (x != 1) {
			if (x % 2 == 0) {
				x = x / 2;
			} else if (x % 2 != 0) {
				x = 3 * x + 1;
			}
			System.out.print(x + ">");
		}
	}

	private static void fatorialDe1A10() {

		System.out.println("Fatorial");

		for (int i = 1; i <= 40; i++) {

			System.out.println("Fatoria de " + i + "=" + calculaFatorial(new BigDecimal(i)));
		}
	}

	private static BigDecimal calculaFatorial(BigDecimal fat) {
		if (fat.equals(BigDecimal.ZERO)) {
			return BigDecimal.ONE;
		}
		return calculaFatorial(fat.subtract(BigDecimal.ONE)).multiply(fat);

	}

	private static void imprimeMultiplusDe3() {

		System.out.println("Multiplus de 3 ");
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0)
				System.out.println(i);
		}
	}

	private static void imprimeSomaDe1Ate1000() {

		int soma = 0;
		int incremento = 1;
		while (incremento <= 1000) {
			soma += incremento++;
		}

		System.out.println(soma);
	}

	private static void lacoNaoAlcanca300() {
		int valor = 150;
		while (valor < 300) {
			System.out.println(valor++);
		}
	}
}
