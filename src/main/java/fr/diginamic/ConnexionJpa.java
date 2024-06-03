package fr.diginamic;

import fr.diginamic.entites.Region;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ConnexionJpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();
		
		Region br = em.find(Region.class, 1);
		System.out.println(br);

		Region iDF= new Region();
		iDF.setNom("Île de France");
		em.persist(iDF);
		long id=iDF.getId();
		System.out.println(id);
		
		transaction.commit();
		
	}

}
