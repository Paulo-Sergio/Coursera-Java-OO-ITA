package tarefa2.construtores;

public class Compra {

	int valorTotal;
	int numeroParcelas;

	// a vista
	public Compra(int valor) {
		valorTotal = valor;
		numeroParcelas = 1;
	}

	// parcelado
	public Compra(int qtdParcelas, int valorParcelas) {
		numeroParcelas = qtdParcelas;
		valorTotal = valorParcelas * qtdParcelas;
	}

	public int getValorTotal() {
		return valorTotal;
	}

	public int getNumeroParcelas() {
		return numeroParcelas;
	}

	public int getValorParcela() {
		return valorTotal / numeroParcelas;
	}
}
