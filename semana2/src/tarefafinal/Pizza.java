package tarefafinal;

import java.util.HashMap;

public class Pizza {

	private double preco;
	private int ingredientes = 0;
	public static int totalIngredientes;

	public static HashMap<String, Integer> sabor = new HashMap<>();

	public void adicionaIngrediente(String ingrediente) {
		this.ingredientes++;
		contabilizaIngrediente(ingrediente);
	}

	public void contabilizaIngrediente(String ingrediente) {
		Integer qtdIngredienteAtual = sabor.get(ingrediente);
		if (qtdIngredienteAtual == null) {
			qtdIngredienteAtual = 1;
		} else {
			qtdIngredienteAtual++;
		}
		sabor.put(ingrediente, qtdIngredienteAtual);

		totalIngredientes++;
	}

	public double getPreco() {
		if (ingredientes <= 2) {
			preco = 15;
		} else if (ingredientes >= 3 && ingredientes <= 5) {
			preco = 20;
		} else {
			preco = 23;
		}

		return preco;
	}

	public int getIngredientes() {
		return ingredientes;
	}

}
