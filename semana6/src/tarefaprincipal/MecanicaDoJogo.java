package tarefaprincipal;

public interface MecanicaDoJogo {

	public void mecanicaTresVidas(String resposta);

	public void mecanicaMorteSubita(String resposta);


	public boolean isJogoContinua();
	public int getPontos();
}
