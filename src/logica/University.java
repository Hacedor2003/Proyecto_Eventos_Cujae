package logica;

import java.time.LocalDate;
import java.util.ArrayList;

public class University {

	// Atributos
	private String name; // Nombre de la universidad
	private String information; // Informaci�n general de la universidad
	private ArrayList<Event> events; // Lista de eventos organizados por la
										// universidad
	private ArrayList<User> users; // Lista de users registrados en la
									// universidad
	private User rector;

	// Constructor
	public University(String nombre, String informacion, User rector) {
		this.name = nombre;
		this.information = informacion;
		this.events = new ArrayList<Event>();
		this.users = new ArrayList<User>();
		this.rector = rector;
	}

	/**
	 * M�todo getter del atributo nombre
	 * 
	 * @return El nombre de la universidad
	 */
	public String getNombre() {
		return name;
	}

	/**
	 * M�todo setter del atributo nombre
	 * 
	 * @param nombre
	 *            El nuevo nombre de la universidad
	 */
	public void setNombre(String name) {
		if (name == null || name.trim().length() < 3) {
			throw new IllegalArgumentException(
					"El nombre de la universidad debe tener al menos 3 caracteres.");
		}
		this.name = name.trim();
	}

	/**
	 * M�todo getter del atributo informacion
	 * 
	 * @return La informaci�n general de la universidad
	 */
	public String getInformacion() {
		return information;
	}

	/**
	 * M�todo setter del atributo informacion
	 * 
	 * @param informacion
	 *            La nueva informaci�n general de la universidad
	 */
	public void setInformacion(String information) {
		if (information == null) {
			throw new IllegalArgumentException(
					"La informaci�n general de la universidad no puede ser nula.");
		}
		this.information = information;
	}

	// M�todos para gestionar eventos

	/**
	 * M�todo para agregar un evento a la lista de eventos de la universidad
	 * 
	 * @param evento
	 *            El evento a agregar
	 */
	public void addEvento(Event evento) {
		if (evento.getFecha_inicio().isBefore(LocalDate.now())) {
			throw new IllegalArgumentException(
					"No se permite agregar un evento con fecha de inicio anterior a la fecha actual.");
		}
		events.add(evento);
	}

	/**
	 * M�todo para eliminar un evento de la lista de eventos de la universidad
	 * 
	 * @param evento
	 *            El evento a eliminar
	 */
	public void eliminarEvento(Event evento) {
		events.remove(evento);
	}

	/**
	 * M�todo getter del atributo eventos
	 * 
	 * @return La lista de eventos organizados por la universidad
	 */
	public ArrayList<Event> getEventos() {
		return events;
	}

	/**
	 * M�todo para obtener la lista de eventos que se llevar�n a cabo en un
	 * place espec�fico
	 * 
	 * @param place
	 *            El place donde se llevar�n a cabo los eventos
	 * @return La lista de eventos que se realizar�n en el place especificado
	 */
	public ArrayList<Event> getEventosEnLugar(String lugar) {
		ArrayList<Event> lista_Eventos = new ArrayList<Event>();
		for (Event evento : events) {
			if (evento.getLugar().equals(lugar)) {
				lista_Eventos.add(evento);
			}
		}
		return lista_Eventos;
	}
	public ArrayList<Event> listEventType(String typeEvent){

		ArrayList<Event> a = new ArrayList<Event>();

		for(Event e: events){
			if(e.getTipo_evento().equals(typeEvent))
				a.add(e);
		}

		return a;
	}

	// M�todos para gestionar users

	/**
	 * M�todo para agregar un usuario a la lista de users de la universidad
	 * 
	 * @param usuario
	 *            El usuario a agregar
	 */
	public void addUsuario(User usuario) {
		users.add(usuario);
	}

	/**
	 * M�todo getter del atributo users
	 * 
	 * @return La lista de users registrados en la universidad
	 */
	public ArrayList<User> getUsuarios() {
		return users;
	}

	/**
	 * M�todo para obtener el recto de la universidad
	 * 
	 * @param rector
	 *            Un usuario que es un administrador
	 * @return el administrador general
	 */
	public User getRector() {
		return rector;
	}

	/**
	 * M�todo para establecer el rector de la universidad
	 * 
	 * @param rector
	 *            Un usuario que es un administrador
	 */
	public void setRector(User rector) {
		this.rector = rector;
	}

	public int reporte_Cantidad_Eventos() {
		return events.size();
	}

	public int reporte_Cantidad_Admistradores() {
		int cantidad = 0;
		for (User u : users) {
			if (u.getIsEsAdmin()) {
				cantidad++;
			}
		}
		return cantidad;
	}

	public int reporte_Participacion_Evento(String nombre_evento) {
		int cantidad = 0;
		for (Event e : events) {
			if (e.getNombre_evento().equals(nombre_evento)) {
				cantidad = e.getParticipacion();
			}
		}
		return cantidad;
	}
}
