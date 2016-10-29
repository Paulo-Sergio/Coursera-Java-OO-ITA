package tarefa1.junit;

public class Carro {

	int potencia;
	int velocidade;
	String nome;

	void acelerar() {
		velocidade += potencia;
	}

	void frear() {
		velocidade = velocidade / 2;
	}

	int getVelocidade() {
		return velocidade;
	}

	void imprimir() {
		System.out.println("O carro " + nome + " esta a velocidade " + getVelocidade() + "km/h");
	}
}
