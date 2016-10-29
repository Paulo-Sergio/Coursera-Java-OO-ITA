package tarefaprincipal;

public class Principal {

	public static void main(String[] args) {

		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("mussarela");
		p1.adicionaIngrediente("calabresa");
		p1.adicionaIngrediente("cebola");

		System.out.println("------------------PIZZA 01--------------------");
		System.out.println("Preço: " + p1.getPreco());

		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("mussarela");
		p2.adicionaIngrediente("frango");
		p2.adicionaIngrediente("cheedar");
		p2.adicionaIngrediente("catupiry");
		p2.adicionaIngrediente("presunto");
		p2.adicionaIngrediente("cebola");

		System.out.println("------------------PIZZA 02--------------------");
		System.out.println("Preço: " + p2.getPreco());

		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("mussarela");

		System.out.println("------------------PIZZA 03--------------------");
		System.out.println("Preço: " + p3.getPreco());

		CarrinhoCompras carrinho = new CarrinhoCompras();
		carrinho.adicionaPizza(p1);
		carrinho.adicionaPizza(p2);
		carrinho.adicionaPizza(p3);

		System.out.println("------------------Carrinho--------------------");
		System.out.println("Valor Total: " + carrinho.valorTotal());

		System.out.println("Total de ingredientes utilizados: " + Pizza.totalIngredientes);

		System.out.println("-----------------------------------------------");
		for (String ingrediente : Pizza.sabor.keySet()) {
			Integer qtd = Pizza.sabor.get(ingrediente);
			System.out.println("Ingrediente: " + ingrediente + " - Quantidade: " + qtd);
		}
	}

}
