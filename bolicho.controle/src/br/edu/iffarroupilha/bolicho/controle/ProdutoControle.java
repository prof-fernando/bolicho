package br.edu.iffarroupilha.bolicho.controle;

import br.edu.iffarroupilha.bolicho.modelo.Cliente;
import br.edu.iffarroupilha.bolicho.modelo.Produto;

/**
 * <p>
 * Classe que concentra as lógicas ligadas ao produto
 * </p>
 **/

public class ProdutoControle extends AControle {

	/**
	 * <p>
	 * Valida se os dados do produto estão corretos
	 * </p>
	 */
	public String validarProduto(Produto p) {
		if (p != null) {
			if (p.getPreco() == 0) {
				return "Informe o preco";
			} else if (p.getDescricao() == null || p.getDescricao().isEmpty()) {
				return "Por favor, informe a descrição do produto";
			}

		} else {
			return "Dados do produto não informado!";
		}
		return null;
	}

}