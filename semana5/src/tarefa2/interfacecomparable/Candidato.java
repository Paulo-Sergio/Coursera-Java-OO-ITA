package tarefa2.interfacecomparable;

public class Candidato implements Comparable<Candidato> {

	private int nota;
	private boolean deficiente;
	private int idade;

	public Candidato(int nota, boolean deficiente, int idade) {
		super();
		this.nota = nota;
		this.deficiente = deficiente;
		this.idade = idade;
	}

	@Override
	public int compareTo(Candidato outro) {
		if (this.nota == outro.getNota()) {
			if (this.deficiente == outro.isDeficiente()) {
				return this.idade - outro.getIdade();
			} else {
				if (this.deficiente)
					return 1;
				else
					return -1;
			}
		} else {
			return nota - outro.getNota();
		}
	}

	public int getNota() {
		return nota;
	}

	public boolean isDeficiente() {
		return deficiente;
	}

	public int getIdade() {
		return idade;
	}

	@Override
	public String toString() {
		return nota + ";" + deficiente + ";" + idade;
	}

}
