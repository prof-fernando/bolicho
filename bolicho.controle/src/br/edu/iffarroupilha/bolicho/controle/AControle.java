package br.edu.iffarroupilha.bolicho.controle;

import java.util.List;

/**
 * <p>
 * controlador genérico que agrupa as funções comuns de lógicas, como gravar,
 * buscar etc
 * </p>
 */
public abstract class AControle {
	// gravar ou atualizar uma informação
	// em banco
	public void gravar(Object entidade) {

	}

	// busca todos os registros de uma
	// determinada entidade (classe)
	public List buscarTodos(Class classe) {
		return null;
	}

	// excluir entidades
	public void excluir(Object entidade) {

	}

}