package br.com.casadocodigo.loja.dao;

import javax.persistence.EntityManager;

import br.com.casadocodigo.loja.models.Livro;

public class LivroDao {


	private EntityManager manager;

	public void salvar( Livro livro ) {
		manager.persist( livro );
	}

}
