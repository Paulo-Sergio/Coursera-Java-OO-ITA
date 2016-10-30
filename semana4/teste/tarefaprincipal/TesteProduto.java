package tarefaprincipal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TesteProduto {

	Produto queijo;
	Produto manteiga;
	Produto outroQueijo;
	CarrinhoCompras cc;

	@Before
	public void inicializaProdutos() {
		queijo = new Produto(991, "Queijo", 9.5);
		manteiga = new Produto(992, "Manteiga", 4);
		outroQueijo = new Produto(991, "Queijo", 9.5);

		cc = new CarrinhoCompras();
		cc.adicionaProduto(queijo, 4);
		cc.adicionaProduto(manteiga, 3);
		cc.adicionaProduto(outroQueijo, 2);
	}

	@After
	public void limpaProdutos() {
		cc.removerTudo();
	}

	@Test
	public void testProdutoMesmoCodigo() {
		assertTrue(queijo.equals(outroQueijo));
	}

	@Test
	public void testProdutoDiferenteCodigo() {
		assertTrue(!queijo.equals(manteiga));
	}
	
	@Test
	public void testQtdProdutos() {
		int qtdProdutos = 0;
		for (Integer qtd : cc.getProdutosNoCarrinho().values()) {
			qtdProdutos += qtd;
		}
		assertEquals(9, qtdProdutos);
	}
	
	@Test
	public void testQtdRemoveProdutos() {
		cc.removeProduto(queijo, 2);
		cc.removeProduto(manteiga, 2);
		int qtdProdutos = 0;
		for (Integer qtd : cc.getProdutosNoCarrinho().values()) {
			qtdProdutos += qtd;
		}
		
		assertEquals(5, qtdProdutos);
	}
}
