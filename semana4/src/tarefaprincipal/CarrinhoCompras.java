package tarefaprincipal;

import java.util.HashMap;
import java.util.Map;

public class CarrinhoCompras {

	private Map<Produto, Integer> produtosNoCarrinho = new HashMap<>();

	public void adicionaProduto(Produto produto, int quantidade) {
		if (verificaJaExiste(produto)) {
			Integer qtdAtual = getProdutosNoCarrinho().get(produto);
			Integer qtdResult = qtdAtual + quantidade;
			getProdutosNoCarrinho().put(produto, qtdResult);
		} else {
			getProdutosNoCarrinho().put(produto, quantidade);
		}
	}

	private boolean verificaJaExiste(Produto produto) {
		for (Produto p : getProdutosNoCarrinho().keySet()) {
			if (p.equals(produto)) {
				return true;
			}
		}
		return false;
	}
	
	public void removeProduto(Produto produto, int quantidade) {
		Integer qtdAtual = getProdutosNoCarrinho().get(produto);
		Integer qtdResult = qtdAtual - quantidade;
		if (qtdResult > 0) {
			getProdutosNoCarrinho().put(produto, qtdResult);
		} else {
			getProdutosNoCarrinho().remove(produto);
		}
	}
	
	public void removerTudo(){
		getProdutosNoCarrinho().clear();
	}
	
	public double valorTotalCompra() {
		double totalPagar = 0;
		for (Produto produto : getProdutosNoCarrinho().keySet()) {
			Integer quantidade = getProdutosNoCarrinho().get(produto);
			totalPagar = (produto.getPreco() * quantidade) + totalPagar;
		}
		return totalPagar;
	}

	public Map<Produto, Integer> getProdutosNoCarrinho() {
		return produtosNoCarrinho;
	}


}
