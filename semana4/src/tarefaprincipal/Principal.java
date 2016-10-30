package tarefaprincipal;

public class Principal {

	public static void main(String[] args) {

		Produto p1 = new ProdutoComTamanho(991, "produto1", 10.50, 40);
		Produto p2 = new ProdutoComTamanho(992, "produto2", 20.65, 42);
		Produto p3 = new ProdutoComTamanho(991, "produto3", 10.50, 40);
		Produto p4 = new ProdutoComTamanho(994, "produto4", 8.75, 42);
		Produto p5 = new ProdutoComTamanho(991, "produto5", 10.50, 44);
		Produto p6 = new Produto(995, "produto6", 30);

		CarrinhoCompras cc = new CarrinhoCompras();
		cc.adicionaProduto(p1, 2); // R$ 21
		cc.adicionaProduto(p2, 1); // R$ 20,65
		cc.adicionaProduto(p3, 5); // R$ 52,5
		cc.adicionaProduto(p4, 3); // R$ 26,25
		cc.adicionaProduto(p5, 2); // R$ 21
		cc.adicionaProduto(p6, 2); // R$ 60

		cc.removeProduto(p3, 1); // 10,5
		cc.removeProduto(p6, 2); // 60

		for (Produto produto : cc.getProdutosNoCarrinho().keySet()) {
			Integer qtd = cc.getProdutosNoCarrinho().get(produto);
			System.out.println("Produto: " + produto.getNome() + 
					" Codigo: " + produto.getCodigo() + 
					" Quantidade: " + qtd);
		}
		
		System.out.println("----------------------------");
		System.out.println("Total: " + cc.valorTotalCompra());
		System.out.println("----------------------------");
		
		// P1 tem o mesmo codigo e mesmo tamanho comparado com P3
		System.out.println("Produto1 é igual Produto3? "+ p1.equals(p3));
		// P1 tem o mesmo codigo, mas nao tem o mesmo tamanho comparado com P5
		System.out.println("Produto1 é igual Produto5? "+ p1.equals(p5));
	}

}
