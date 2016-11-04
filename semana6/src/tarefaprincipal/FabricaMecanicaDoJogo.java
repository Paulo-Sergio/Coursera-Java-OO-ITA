package tarefaprincipal;

import java.io.FileNotFoundException;

public class FabricaMecanicaDoJogo implements MecanicaDoJogo {

	private String palavra;
	private int pontos = 0;
	private int vidas = 3;
	
	public void palavraResposta() {
		String palavraRetirada = "";
		try {
			palavraRetirada = new BancoDePalavras().palavraRetirada();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.palavra = palavraRetirada;
	}

	@Override
	public void mecanicaTresVidas(String resposta) {
		if (isAcertou(resposta)) {
			this.pontos += 10;
		} else {
			this.vidas--;
		}
	}

	@Override
	public void mecanicaMorteSubita(String resposta) {
		if (isAcertou(resposta)) {
			this.pontos += 25;
		} else {
			this.vidas = 0;
		}
	}

	public boolean isJogoContinua() {
		return this.vidas > 0;
	}

	public int getPontos() {
		return pontos;
	}

	public boolean isAcertou(String resposta) {
		if (this.palavra.equalsIgnoreCase(resposta)) {
			return true;
		}
		return false;
	}

	public String getPalavra() {
		return palavra;
	}

	public int getVidas() {
		return vidas;
	}
}
