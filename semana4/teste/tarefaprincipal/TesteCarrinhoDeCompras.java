package tarefaprincipal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TesteCarrinhoDeCompras {

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
	public void totalCarrinho(){
		double valorTotal = cc.valorTotalCompra();
		assertEquals(595, (int)valorTotal);
	}
	
	@Test
	public void testRemoveProdutos() {
		cc.removeProduto(roupaD, 2);
		cc.removeProduto(roupaE, 1);
		double valorTotal = cc.valorTotalCompra();
		
		assertEquals(484, (int)valorTotal);
	}
}
