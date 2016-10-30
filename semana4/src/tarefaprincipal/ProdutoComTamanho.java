package tarefaprincipal;

public class ProdutoComTamanho extends Produto {

	private int tamanho;

	public ProdutoComTamanho(int cod, String nome, double preco, int tamanho) {
		super(cod, nome, preco);
		this.tamanho = tamanho;
	}

	public int getTamanho() {
		return tamanho;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(getTamanho());
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoComTamanho other = (ProdutoComTamanho) obj;
		if (Double.doubleToLongBits(getTamanho()) != Double.doubleToLongBits(other.getTamanho()))
			return false;
		return true;
	}
}
