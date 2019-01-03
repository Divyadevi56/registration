package com.cg.jpastart.entities;




	import java.util.Scanner;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;

	public class DistanceTest {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			EntityManagerFactory factory = 
					Persistence.createEntityManagerFactory("JPA-PU");
			EntityManager em = factory.createEntityManager();
			em.getTransaction().begin();
			Distance distance = new Distance();
			System.out.println("Enter id");
			distance.setDistanceId(sc.nextInt());
			System.out.println("EnterSource");
			distance.setSource(sc.next());
			System.out.println("Enter destination");
			distance.setDestination(sc.next());
			
			System.out.println("Enter distance in km");
			distance.setDistance(sc.nextInt());
			//distance.setDistanceInMiles());
			
			em.persist(distance);
			
			System.out.println("Added  to database.");
			
			
			em.getTransaction().commit();
			em.close();
			factory.close();
		}
	}


