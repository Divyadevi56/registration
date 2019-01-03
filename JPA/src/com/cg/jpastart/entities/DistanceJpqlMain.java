package com.cg.jpastart.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class DistanceJpqlMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		String sql = "SELECT distance FROM distance_record WHERE distanceId=1";
		TypedQuery<Distance> query = (TypedQuery<Distance>) em.createQuery(sql);
		
		Distance distance = (Distance) query.getSingleResult();
		System.out.println("id = "+distance.getDistanceId());
		//System.out.println("name = "+distance.());
		
		
	}

}
