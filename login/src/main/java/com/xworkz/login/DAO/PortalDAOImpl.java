package com.xworkz.login.DAO;

import com.xworkz.login.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Repository
public class PortalDAOImpl implements PortalDAO {

    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public boolean signUp(StudentEntity studentEntity) {
        EntityManager em = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction tx = em.getTransaction();
            tx.begin();
            em.persist(studentEntity);
            tx.commit();
            return true;
        } finally {
            em.close();
        }
    }

    @Override
    public StudentEntity getUserByEmail(String email) {
        EntityManager em = entityManagerFactory.createEntityManager();
        try {
            Query query = em.createNamedQuery("findByEmail");
            query.setParameter("studentEmail", email);
            return (StudentEntity) query.getSingleResult();
        } catch (Exception e) {
            return null;
        } finally {
            em.close();
        }
    }

    @Override
    public String getPasswordByEmail(String email) {
        EntityManager em = entityManagerFactory.createEntityManager();
        try {
            Query query = em.createNamedQuery("getPasswordByEmail");
            query.setParameter("studentEmail", email);
            return (String) query.getSingleResult();
        } catch (Exception e) {
            return null;
        } finally {
            em.close();
        }
    }

    @Override
    public boolean updateUser(StudentEntity entity) {
        EntityManager em = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction tx = em.getTransaction();
            tx.begin();
            em.merge(entity);
            tx.commit();
            return true;
        } finally {
            em.close();
        }
    }
}