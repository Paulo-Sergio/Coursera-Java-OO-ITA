package tarefafinal;

import java.util.ArrayList;

public class CarrinhoCompras {

	private ArrayList<Pizza> pizzas = new ArrayList<>();

	public void adicionaPizza(Pizza p) {
		if (p.getIngredientes() > 0) {
			pizzas.add(p);
		}
	}
	
	public int qtdPizzasAdicionadas(){
		return pizzas.size();
	}

	public double valorTotal() {
		double total = 0;

		for (Pizza pizza : pizzas) {
			total += pizza.getPreco();
		}

		return total;
	}
}
