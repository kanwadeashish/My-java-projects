package com.xworkz.portal.DAO;

import com.xworkz.portal.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

@Repository
public class UserDAOImpl implements UserDAO{

    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public boolean userSaveDB(UserEntity userEntity) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(userEntity);
            transaction.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error in 'userSaveDB' method " + e.getMessage());
            return false;
        } finally {
            entityManager.close();
        }


    }

    @Override
    public UserEntity checkingExistUserInDBByEmail(String email) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            Query query = entityManager.createNamedQuery("findByEmail");
            query.setParameter("byEmail",email);
            UserEntity singleResult =(UserEntity) query.getSingleResult();
            return singleResult;

        }catch (Exception e){
            System.out.println("Error in 'checkingExistUserInDBByEmail' method "+e.getMessage());
            return null;
        }finally {
            entityManager.close();
        }
    }

    @Override
    public String loginDataCheckInDB(String email) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        String passwordFromDB = null;

        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            Query query = entityManager.createNamedQuery("findByLogin");
            query.setParameter("byEmail",email);

            passwordFromDB =(String) query.getSingleResult();
            return passwordFromDB;

        }catch (Exception e){
            System.out.println("Error in 'loginDataCheckInDB' method "+e.getMessage());
            return null;
        }finally {
            entityManager.close();
        }

    }
}
