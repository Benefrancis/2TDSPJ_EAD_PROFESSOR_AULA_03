package br.com.fiap.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Repository {
    EntityManagerFactory factory;
    EntityManager entityManager;

    public Repository() {
        this.factory = Persistence.createEntityManagerFactory("maria-db");
        this.entityManager = factory.createEntityManager();
    }
    public EntityManagerFactory getFactory() {
        return factory;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void close(){
        this.factory.close();
        this.entityManager.close();
    }
}
