package tarefa4.heranca;

import java.util.HashMap;
import java.util.Map;

public class Corrida {

	private int pista;
	// carro vai ser a chave e distancia pecorrida o valor
	private Map<CarroDeCorrida, Integer> carros = new HashMap<>();

	public Corrida(int tamanho) {
		this.pista = tamanho;
	}

	public void adicionaCarro(CarroDeCorrida carro) {
		carros.put(carro, 0);
	}

	private boolean terminou() {
		for (Integer valor : carros.values()) {
			if (valor >= this.pista)
				return true;
		}
		return false;
	}

	public void umDoisTresJa() {
		while (!terminou()) {
			for (CarroDeCorrida carro : this.carros.keySet()) {
				carro.acelerar();
				int distancia = carros.get(carro);
				distancia += carro.getVelocidade();
				this.carros.put(carro, distancia);
			}
		}
		
		for (CarroDeCorrida carro : this.carros.keySet()) {
			System.out.println(carro.getNome() +" - "+ carros.get(carro));
		}
	}
}
