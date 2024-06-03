package fr.diginamic;

import java.util.Scanner;

import fr.diginamic.entites.Livre;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class biblioJpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = em.getTransaction();

		transaction.begin();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez saisir l'identifiant d'un livre : ");
		int choixId = scanner.nextInt();
		Livre livre = em.find(Livre.class, choixId);
		if (livre == null) {
			System.out.println("L'identifiant saisi ne correspond à aucun livre");
		} else {
			System.out.println(livre);
		}

		transaction.commit();
	}

}
