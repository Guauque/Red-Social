package persistence;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

import logic.Persona;

public class CRUD_Persona extends HttpServlet{

	public DatastoreService dataStore;
	String entidad = "Persona";
	Persona persona = new Persona("1051954972", "Camilo", "Molina", "31-05.1988", "masculino", "josecamilo.molina@uptc.edu.co", "1234");
	private Entity entidadPersona;

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException ,IOException {

		dataStore = DatastoreServiceFactory.getDatastoreService();
		crear(entidad,persona);

	}
	
	private void crear(String entity, Persona persona) {
		entidadPersona = new Entity(entity);
		entidadPersona.setProperty("Cedula", persona.getCedula());
		entidadPersona.setProperty("Nombres", persona.getNombres());
		entidadPersona.setProperty("Apellidos", persona.getApellidos());
		entidadPersona.setProperty("Fecha", persona.getFecha());
		entidadPersona.setProperty("Genero", persona.getGenero());
		entidadPersona.setProperty("Correo", persona.getCorreo());
		entidadPersona.setProperty("Contrasenia", persona.getContrasenia());
		dataStore.put(entidadPersona);
	}
}
