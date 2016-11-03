package tarefaprincipal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BancoDePalavras {

	public List<String> buscandoPalavras() throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("palavras.txt"));
		List<String> palavras = new ArrayList<>();

		while (sc.hasNextLine()) {
			String palavra = sc.nextLine();
			palavras.add(palavra);
		}
		sc.close();
		return palavras;
	}

	public String palavraRetirada() throws FileNotFoundException {
		List<String> palavras = buscandoPalavras();
		// vai embaralhar as palavras
		Collections.shuffle(palavras);

		return palavras.get(0);
	}
}
