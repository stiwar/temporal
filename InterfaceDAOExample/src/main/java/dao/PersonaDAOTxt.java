package dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import interfaces.IPersonaDAO;
import models.Persona;

public class PersonaDAOTxt implements IPersonaDAO {

	private static final String RUTA_ARCHIVO_NOMBRES = "D:\\nombres.txt";

	public Persona registrar(Persona persona) {

		String contenido = persona.getNombre();
		File file = new File(RUTA_ARCHIVO_NOMBRES);

		try {
			
			// Si el archivo no existe es creado
			if (!file.exists())
				file.createNewFile();
			else
				contenido = "\n" + contenido;
			
			FileWriter fw = new FileWriter(file,true);
	        BufferedWriter bw = new BufferedWriter(fw);
	        bw.write(contenido);
	        bw.close();
	        
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return null;
	}

}
