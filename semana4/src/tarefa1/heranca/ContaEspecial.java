package tarefa1.heranca;

public class ContaEspecial extends ContaCorrente {

	int limite;

	public ContaEspecial(int limite) {
		this.limite = limite;
	}

	@Override
	public int sacar(int valor) {
		if (valor > (this.saldo + this.limite)) {
			return 0;
		} else {
			this.saldo -= valor;
			return valor;
		}
	}
}
