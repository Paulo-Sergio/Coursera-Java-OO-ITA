package tarefa1.encapsulamento;

public class Pilha {

	private Object[] elementos;
	private int topo = 0;

	public Pilha(int maximo) {
		this.elementos = new Object[maximo];
	}

	public void empilhar(Object elemento) {
		this.elementos[topo] = elemento;
		topo++;
	}

	public Object desempilhar() {
		topo--;
		return elementos[topo];
	}

	public Object topo() {
		return this.elementos[topo - 1];
	}

	public int tamanho() {
		return topo;
	}

	public Object[] getElementos() {
		return elementos;
	}
}
