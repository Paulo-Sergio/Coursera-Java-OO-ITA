package tarefaprincipal;

import java.io.FileNotFoundException;
import java.util.List;

public class PrincipalDeTestes {

	public static void main(String[] args) throws FileNotFoundException {

		BancoDePalavras bp1 = new BancoDePalavras();
		List<String> palavras = bp1.buscandoPalavras();

		for (String p : palavras) {
			// System.out.println(p);
		}

		BancoDePalavras bp2 = new BancoDePalavras();
		String palavra = bp2.palavraRetirada();
		System.out.println("Nomal: 		" + palavra);

		Embaralhador embaralhadorContrario = new FabricaEmbaralhadores();
		String palavraEmbaralhadaContrario = embaralhadorContrario.palavraEmbaralhadaContrario(palavra);
		System.out.println("Ao contrario:	 " + palavraEmbaralhadaContrario);

		Embaralhador embaralhadorRandom = new FabricaEmbaralhadores();
		String palavraEmbaralhadaRandom = embaralhadorRandom.palavraEmbaralhadaRandom(palavra);
		System.out.println("Random: 	" + palavraEmbaralhadaRandom);
	}

}
