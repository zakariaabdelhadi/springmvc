package com.is.webstore;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.koor.webstore.business.Article;

public class ConsoleJPA {

    public static void main(String[] args) throws Exception {
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        EntityTransaction txn = null;

        try {
        	
            entityManagerFactory = Persistence.createEntityManagerFactory("persist");
            entityManager = entityManagerFactory.createEntityManager();
            txn = entityManager.getTransaction();
			txn.begin();
			entityManager.createNativeQuery( "CREATE TABLE IF NOT EXISTS T_articles (FOO_ID int)" ).executeUpdate();
			txn.commit();
			//entitymanageer.persist ???
			System.out.println("rana mla7 al hamdoulillah");
        } 
            finally {
            if ( entityManager != null ) entityManager.close();
            if ( entityManagerFactory != null ) entityManagerFactory.close();
        }
    }
}