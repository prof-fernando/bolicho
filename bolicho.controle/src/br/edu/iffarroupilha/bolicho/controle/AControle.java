package br.edu.iffarroupilha.bolicho.controle;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import br.edu.iffarroupilha.bolicho.modelo.dao.HibernateDAO;

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
		// estabele a conexao
		Session sessao = HibernateDAO.getSessao();
		// abre uma transacao
		sessao.getTransaction().begin();
		// salva no banco
		sessao.saveOrUpdate(entidade);
		// comita as alterações
		sessao.getTransaction().commit();

	}

	// busca todos os registros de uma
	// determinada entidade (classe)
	public List buscarTodos(Class classe) {
		// estabele a conexao
		Session sessao = HibernateDAO.getSessao();
		Criteria c = sessao.createCriteria(classe);
		return c.list();
	}

	// excluir entidades
	public void excluir(Object entidade) {

	}

	/**
	 * <p>
	 * Converte um termo em numero, caso esteja em formato invpalido retorna-se
	 * zero
	 * </p>
	 */
	public int converteInteiro(String termo) {
		try {
			return Integer.parseInt(termo);
		} catch (Exception e) {
			return 0;
		}
	}

	/**
	 * <p>
	 * Converte um termo em numero com casas decimais, caso esteja em formato
	 * invpalido retorna-se zero
	 * </p>
	 */
	public float converteFlutuante(String termo) {
		try {
			return Float.parseFloat(termo);
		} catch (Exception e) {
			return 0;
		}
	}

}