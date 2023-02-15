package br.com.fiap.repository;

import br.com.fiap.model.Categoria;

public class CategoriaRepository extends Repository {

    public CategoriaRepository() {
        super();
    }

    public void save(Categoria categoria) {
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(categoria);
        this.entityManager.getTransaction().commit();
        this.close();
    }

}
