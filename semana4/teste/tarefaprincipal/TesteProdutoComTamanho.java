package tarefaprincipal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TesteProdutoComTamanho {

	Produto roupaA;
	Produto roupaB;
	Produto roupaC;
	Produto roupaD;
	Produto roupaE;
	CarrinhoCompras cc;
	
	@Before
	public void inicializaProdutos() {
		roupaA = new ProdutoComTamanho(221, "RoupaA", 50.5, 42);
		roupaB = new ProdutoComTamanho(221, "RoupaB", 50.5, 44);
		roupaC = new ProdutoComTamanho(223, "RoupaC", 75.5, 40);
		roupaD = new ProdutoComTamanho(224, "RoupaD", 30.5, 46);
		roupaE = new ProdutoComTamanho(221, "RoupaE", 50.5, 42);
		
		cc = new CarrinhoCompras();
		cc.adicionaProduto(roupaA, 2);
		cc.adicionaProduto(roupaB, 1);
		cc.adicionaProduto(roupaC, 4);
		cc.adicionaProduto(roupaD, 3);
		cc.adicionaProduto(roupaE, 1);
	}
	
	@After
	public void destroiProdutos(){
		cc.removerTudo();
	}
	
	@Test
	public void testProdutoMesmoCodigoTamanho() {
		assertTrue(roupaA.equals(roupaE));
	}
	
	@Test
	public void testProdutoMesmoCodigoTamanhoDiferente() {
		assertTrue(!roupaA.equals(roupaB));
	}
	
	@Test
	public void testQtdProdutos() {
		int qtdTotalProdutos = 0;
		for(Integer qtdProdutos : cc.getProdutosNoCarrinho().values()){
			qtdTotalProdutos += qtdProdutos;
		}
		
		assertEquals(11, qtdTotalProdutos);
	}
	
	@Test
	public void testQtdRemoveProdutos() {
		cc.removeProduto(roupaD, 2);
		cc.removeProduto(roupaE, 1);
		int qtdTotalProdutos = 0;
		for(Integer qtdProdutos : cc.getProdutosNoCarrinho().values()){
			qtdTotalProdutos += qtdProdutos;
		}
		
		assertEquals(8, qtdTotalProdutos);
	}

}
