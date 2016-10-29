package tarefa3.metodosoo;

public class Principal {

	public static void main(String[] args) {

		Aluno paulo = new Aluno();
		paulo.bim1 = 70;
		paulo.bim2 = 60;
		paulo.bim3 = 80;
		paulo.bim4 = 70;

		// abordagem procedutal
		// System.out.println(VerificadoraNotas.mediaAluno(paulo));
		// System.out.println(VerificadoraNotas.passouDeAno(paulo));

		// abordagem OO
		System.out.println(paulo.media());
		System.out.println(paulo.passouDeAno());
	}

}
