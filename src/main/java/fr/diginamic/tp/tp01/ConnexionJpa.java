package fr.diginamic.tp.tp01;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnexionJpa {
    public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("demo-JPA");
    EntityManager em = entityManagerFactory.createEntityManager();
    em.getTransaction().begin();
    Auteurs atu = new Auteurs();
    atu.setNom("bob");
    atu.setPreNom("lenon");
    em.persist(atu);
    em.getTransaction().commit();
    System.out.println(atu.getId());
    }
}
