package tarefaprincipal;

import java.util.HashMap;
import java.util.Map;

public class CarrinhoCompras {

	private Map<Produto, Integer> produtosNoCarrinho = new HashMap<>();

	public void adicionaProduto(Produto produto, int quantidade) {
		if (verificaJaExiste(produto)) {
			Integer qtdAtual = this.produtosNoCarrinho.get(produto);
			Integer qtdResult = qtdAtual + quantidade;
			this.produtosNoCarrinho.put(produto, qtdResult);
		} else {
			this.produtosNoCarrinho.put(produto, quantidade);
		}
	}

	private boolean verificaJaExiste(Produto produto) {
		for (Produto p : this.produtosNoCarrinho.keySet()) {
			if (p.equals(produto)) {
				return true;
			}
		}
		return false;
	}
	
	public void removeProduto(Produto produto, int quantidade) {
		Integer qtdAtual = this.produtosNoCarrinho.get(produto);
		Integer qtdResult = qtdAtual - quantidade;
		if (qtdResult > 0) {
			this.produtosNoCarrinho.put(produto, qtdResult);
		} else {
			this.produtosNoCarrinho.remove(produto);
		}
	}
	
	public void removerTudo(){
		this.produtosNoCarrinho.clear();
	}
	
	public double valorTotalCompra() {
		double totalPagar = 0;
		for (Produto produto : this.produtosNoCarrinho.keySet()) {
			Integer quantidade = this.produtosNoCarrinho.get(produto);
			totalPagar = (produto.getPreco() * quantidade) + totalPagar;
		}
		return totalPagar;
	}

	public Map<Produto, Integer> getProdutosNoCarrinho() {
		return produtosNoCarrinho;
	}


}
