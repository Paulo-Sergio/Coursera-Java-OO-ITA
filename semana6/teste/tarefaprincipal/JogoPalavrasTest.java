package tarefaprincipal;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

public class JogoPalavrasTest {

	@Test
	public void embaralhadorTest() {
		try {
			String palavraRetirada = new BancoDePalavras().palavraRetirada();
			String palavraEmbaralhadaContrario = new FabricaEmbaralhadores().palavraEmbaralhadaContrario(palavraRetirada);
			
			String palavraDesimbaralhada = "";
			for (int i = palavraEmbaralhadaContrario.length() - 1; i >= 0; i--) {
				char letra = palavraEmbaralhadaContrario.charAt(i);
				palavraDesimbaralhada += letra;
			}
			
			assertEquals(palavraDesimbaralhada, palavraRetirada);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void mecanicaJogoTest() {
		FabricaMecanicaDoJogo fab = new FabricaMecanicaDoJogo();
		fab.palavraResposta();
		String palavra = fab.getPalavra();
		boolean acertou = fab.isAcertou(palavra);
		
		assertEquals(true, acertou);
	}

}
