package tarefaprincipal;

public class Produto {

	private int codigo;
	private String nome;
	private double preco;
	
	public Produto(int cod, String nome, double preco) {
		this.codigo = cod;
		this.nome = nome;
		this.preco = preco;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + getCodigo();
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (getCodigo() != other.getCodigo())
			return false;
		return true;
	}
}
