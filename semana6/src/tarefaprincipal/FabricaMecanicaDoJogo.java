package tarefaprincipal;

public class FabricaMecanicaDoJogo implements MecanicaDoJogo {

	private String palavra;
	private int pontos = 0;
	private int vidas = 3;
	
	public FabricaMecanicaDoJogo(String palavra) {
		this.palavra = palavra;
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

	@Override
	public boolean isJogoContinua() {
		return this.vidas > 0;
	}
	
	@Override
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
