package tarefaprincipal;

import java.util.Random;

public class FabricaEmbaralhadores implements Embaralhador {

	@Override
	public String palavraEmbaralhadaContrario(String palavra) {
		String palavraEmbaralhada = "";
		for (int i = palavra.length() - 1; i >= 0; i--) {
			char letra = palavra.charAt(i);
			palavraEmbaralhada += letra;
		}

		return palavraEmbaralhada;
	}

	@Override
	public String palavraEmbaralhadaRandom(String palavra) {
		char palavraArray[] = new char[palavra.length()];
		for (int i = 0; i < palavra.length(); i++) {
			palavraArray[i] = palavra.charAt(i);
		}

		Random random = new Random();
		for (int i = 0; i < palavraArray.length; i++) {
			// sorteia um índice
			int j = random.nextInt(palavraArray.length);

			// troca o conteúdo dos índices i e j do vetor
			char temp = palavraArray[i];
			palavraArray[i] = palavraArray[j];
			palavraArray[j] = temp;
		}

		String palavraEmbaralhadaRandom = String.copyValueOf(palavraArray);
		return palavraEmbaralhadaRandom;
	}

}
