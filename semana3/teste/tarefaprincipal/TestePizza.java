package tarefaprincipal;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestePizza {

	@Before
	public void zeraIngredientes() {
		Pizza.zeraTotalIngredientes();
	}

	@After
	public void zeraSaboresPizza() {
		Pizza.sabor = new HashMap<>();
	}

	@Test
	public void testValorPizzaQtd3Ingredientes() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("frango");
		p.adicionaIngrediente("mussarela");
		p.adicionaIngrediente("catupiry");
		// 3 ingredientes = R$ 20

		assertEquals(20, (int) p.getPreco());
	}

	@Test
	public void testRegistroTotalIngredientes() {
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("frango");
		p1.adicionaIngrediente("mussarela");
		p1.adicionaIngrediente("catupiry");

		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("frango");
		p2.adicionaIngrediente("catupiry");
		// 5 ingredientes no total

		assertEquals(5, Pizza.totalIngredientes);
	}

	@Test
	public void testRegistroCadaIngredientes() {
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("frango");
		p1.adicionaIngrediente("mussarela");
		p1.adicionaIngrediente("catupiry");

		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("frango");
		p2.adicionaIngrediente("catupiry");
		// 2 ingrediente (sabor) de frango

		assertEquals(2, (int) Pizza.sabor.get("frango"));
	}

	@Test
	public void testSomaCarrinhoCompras() {
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("frango");
		p1.adicionaIngrediente("mussarela");
		p1.adicionaIngrediente("catupiry");
		// p1 = R$ 20

		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("frango");
		p2.adicionaIngrediente("catupiry");
		// p2 = R$ 15

		CarrinhoCompras carrinho = new CarrinhoCompras();
		carrinho.adicionaPizza(p1);
		carrinho.adicionaPizza(p2);
		// c = R$ 20 + 15 = 35

		assertEquals(35, (int) carrinho.valorTotal());
	}

	@Test
	public void testPizzaSemIngredientes() {
		Pizza p = new Pizza();
		CarrinhoCompras c = new CarrinhoCompras();

		c.adicionaPizza(p);
		// nao deve add a pizza(p) sem ingredientes

		assertEquals(0, c.qtdPizzasAdicionadas());
	}

}
