package quatro.biblioteca.api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Scanner;

public class TesteIO {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("arquivo.txt")));

		String linha = br.readLine();
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}

		br.close();

		// leituraComScannerEEscritaEmArquivo();
		leituraComScannerEEscritaComPrintStreamArquivo();
	}

	private static void leituraComScannerEEscritaComPrintStreamArquivo() throws FileNotFoundException {
		PrintStream saida = new PrintStream(new FileOutputStream("saida.tx"));

		InputStream is = System.in;
		Scanner entrada = new Scanner(is);

		System.out.println("Digite sua mensagem:");
		while (entrada.hasNextLine()) {
			saida.println(entrada.nextLine());
		}
		entrada.close();
		saida.close();

	}

	private static void leituraComScannerEEscritaEmArquivo() throws IOException {

		OutputStream os = new FileOutputStream("saida.tx");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);

		InputStream is = System.in;
		Scanner entrada = new Scanner(is);

		System.out.println("Digite sua mensagem:");
		while (entrada.hasNextLine()) {
			bw.write(entrada.nextLine());
			bw.newLine();
		}
		entrada.close();
		bw.close();

	}

}
