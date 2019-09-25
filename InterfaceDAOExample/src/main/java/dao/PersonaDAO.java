package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import interfaces.IPersonaDAO;
import models.Persona;

public class PersonaDAO{// implements IPersonaDAO{
	
	EntityManagerFactory emf;
	EntityManager em;
	EntityTransaction tx;
	

	public PersonaDAO() {
		emf = Persistence.createEntityManagerFactory("personasPU");
		em = emf.createEntityManager();
		tx = em.getTransaction();
	}


    //@Override
	public Persona registrar(Persona persona) {
		tx.begin();
		em.persist(persona);
		tx.commit();
		return persona;
		

	}

}
