package com.cg.jpastart.entities;


	

	import java.util.Scanner;

import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;
	public class FindId {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			EntityManagerFactory factory =
					Persistence.createEntityManagerFactory("JPA-PU");
			EntityManager em = 
					factory.createEntityManager();
			
			Distance obj = em.find(Distance.class, 2);
			System.out.println("id = "+obj.getDistanceId());
			System.out.println("name ="+obj.getSource());
			
			
			em.getTransaction().begin();
			em.merge(obj);
			em.getTransaction().commit();
			em.close();
		}

	}



