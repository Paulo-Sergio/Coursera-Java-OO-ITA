package tarefaprincipal;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws FileNotFoundException {

		Embaralhador embaralhadorContrario = new FabricaEmbaralhadores();
		Embaralhador embaralhadorRandom = new FabricaEmbaralhadores();

		System.out.println("--------------------------------------------------");
		System.out.println("--------------------------------------------------");
		System.out.println("----------------INICIANDO JOGO--------------------");
		System.out.println("--------------------------------------------------");
		System.out.println("--------------------------------------------------");

		Scanner scannerMecanica = new Scanner(System.in);
		System.out.println("1 - Jogo com três vidas ? (vale 10 pontos por resposta)");
		System.out.println("2 - Jogo morte subita ? (vale 25 pontos por resposta)");
		int mecanicaEscolhida = scannerMecanica.nextInt();

		FabricaMecanicaDoJogo fabricaMecanicaDoJogo = new FabricaMecanicaDoJogo();
		Scanner scanner = new Scanner(System.in);

		if (mecanicaEscolhida == 1) {
			while (fabricaMecanicaDoJogo.isJogoContinua()) {
				fabricaMecanicaDoJogo.palavraResposta();
				String palavraResposta = fabricaMecanicaDoJogo.getPalavra();
				String palavraEmbaralhadaContrario = embaralhadorContrario.palavraEmbaralhadaContrario(palavraResposta);
				System.out.println("A palavra embaralhada é: " + palavraEmbaralhadaContrario);
				System.out.println("Qual a palavra correta ?");
				String resposta = scanner.nextLine();
				fabricaMecanicaDoJogo.mecanicaTresVidas(resposta);

			}
		} else if (mecanicaEscolhida == 2) {
			while (fabricaMecanicaDoJogo.isJogoContinua()) {
				fabricaMecanicaDoJogo.palavraResposta();
				String palavraResposta = fabricaMecanicaDoJogo.getPalavra();
				String palavraEmbaralhadaRandom = embaralhadorRandom.palavraEmbaralhadaRandom(palavraResposta);
				System.out.println("A palavra embaralhada é: " + palavraEmbaralhadaRandom);
				System.out.println("Qual a palavra correta ?");
				String resposta = scanner.nextLine();
				fabricaMecanicaDoJogo.mecanicaMorteSubita(resposta);
			}
		}

		System.out.println("Fim de jogo!!! \nSua pontuação foi: " + fabricaMecanicaDoJogo.getPontos() + " pontos");

		scannerMecanica.close();
		scanner.close();

	}
}
