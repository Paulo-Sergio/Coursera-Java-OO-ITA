package tarefa4.heranca;

public class CarroMulti extends CarroDeCorrida {

	private double potencia;

	public CarroMulti(String nome, double potencia, int velocidadeMaxima) {
		super(nome, velocidadeMaxima);
		if (potencia > 1 && potencia < 2) {
			this.potencia = potencia;
		} else {
			this.potencia = 1.5;
		}
	}

	@Override
	public void acelerar() {
		if (this.velocidade == 0) {
			this.velocidade = 10;
		} else {
			this.velocidade *= this.potencia;
			if (this.velocidade > this.velocidadeMaxima) {
				this.velocidade = this.velocidadeMaxima;
			}
		}
	}

}
