package com.jobsukraine.manytomany.unidirectional;

import javax.persistence.EntityManager;

public class Service {

	EntityManager em;

	public Service(EntityManager em) {
		super();
		this.em = em;
	}

	public Service() {

	}

	

	/* SERVICES FOR USER!!! */

	public void saveUser(User user) {
		
			em.getTransaction().begin();
			em.persist(user);
			em.getTransaction().commit();
		
	}


	/* SERVICES FOR PROGRAM!!! */

	public void saveProgram(Program p) {
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		
	}
	
}
