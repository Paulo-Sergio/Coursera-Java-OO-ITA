package tarefa4.heranca;

public class CarroSoma extends CarroDeCorrida {

	private int potencia;
	
	public CarroSoma(String nome, int potencia, int velocidadeMaxima) {
		super(nome, velocidadeMaxima);
		this.potencia = potencia;
	}

	@Override
	public void acelerar() {
		this.velocidade += this.potencia;
		if (this.velocidade > this.velocidadeMaxima) {
			this.velocidade = this.velocidadeMaxima;
		}
	}
}
