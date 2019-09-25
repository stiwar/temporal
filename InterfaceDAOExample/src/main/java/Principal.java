import models.Persona;
import service.PersonaService;

public class Principal {
	
	public static void main(String[] args) {
		// client
		Persona persona = new Persona("Pedro");
		//System.out.println("antes id: " + persona.getId());

		// server
		PersonaService personaService = new PersonaService();
		persona = personaService.registrarPersona(persona);
		
		//System.out.println("despues id: " + persona.getId());
	}
	
	

}
