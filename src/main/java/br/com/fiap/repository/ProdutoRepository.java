package br.com.fiap.repository;

import br.com.fiap.model.Produto;

public class ProdutoRepository extends Repository {
    public ProdutoRepository() {
        super();
    }

    public void save(Produto produto) {
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(produto);
        this.entityManager.getTransaction().commit();
        this.close();
    }
}
