package service;

import dao.PersonaDAO;
import dao.PersonaDAOTxt;
import interfaces.IPersonaDAO;
import models.Persona;

public class PersonaService {
	
	IPersonaDAO personaDAO;
	
	public PersonaService() {
		//personaDAO = new PersonaDAO();
		personaDAO = new PersonaDAOTxt();
	}
	
	public Persona registrarPersona(Persona persona) {
		return personaDAO.registrar(persona);
	}
}
