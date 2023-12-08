package logica;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public abstract class Event {
	protected String name_event;
	protected String event_type;
	protected String organizer;
	protected LocalDate start_date;
	protected LocalDate end_date;
	protected LocalTime start_time;
	protected LocalTime end_start;
	protected Place place;

	protected int ability;
	protected int stake;
	protected ArrayList<User> users;

	/**
	 * 
	 * @param nombre_evento
	 *            : Nombre Del evento : Ejem = Juegos 13
	 * @param tipo_evento
	 *            : Tipo De evento : Ejem = Deportivo
	 * @param organizador
	 *            : Tipo De Organizador : Ejem = FEU
	 * @param fecha_inicio
	 *            : Fecha Del evento inicio: Ejem = 12 de septiembre de 2023
	 * @param fecha_final
	 *            : Fecha Del evento fin : Ejem = 13 de septiembre de 2023
	 * @param hora_inicio
	 *            : Hora Del evento : Ejem = 10 am
	 * @param hora_final
	 *            : Hora Del evento : Ejem = 11 am
	 * @param place
	 *            : Place Del evento : Ejem = Canchas , Cujae , La Habana
	 * @param end_start 
	 */
	public Event(String name_event, String event_type, String organizador,
			LocalDate start_date, LocalDate end_date,
			LocalTime start_time, LocalTime hora_final, Place place,
			User user, LocalTime end_start) {
		super();
		this.name_event = name_event;
		this.event_type = event_type;
		this.organizer = organizador;
		this.start_date = start_date;
		this.end_date = end_date;
		this.start_time = start_time;
		this.end_start = end_start;
		this.place = place;
		addUsuario(user);
	}

	public Event(String name, String type, String organizer2,
			LocalDate startDate, LocalDate finalDate, LocalTime startTime,
			LocalTime closingTime) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor vacio
	 */

	public String notifyDay() {
		/* Implementer */
		String s = null;
		return s;
	}

	public String getNombre_evento() {
		return name_event;
	}

	public void setNombre_evento(String nombre_evento) {
		this.name_event = nombre_evento;
	}

	public String getTipo_evento() {
		return event_type;
	}

	public void setTipo_evento(String tipo_evento) {
		this.event_type = tipo_evento;
	}

	public String getOrganizador() {
		return organizer;
	}

	public void setOrganizador(String organizador) {
		this.organizer = organizador;
	}

	public LocalDate getFecha_inicio() {
		return start_date;
	}

	public void setFecha_inicio(LocalDate fecha_inicio) {
		this.start_date = fecha_inicio;
	}

	public LocalDate getFecha_final() {
		return end_date;
	}

	public void setFecha_final(LocalDate fecha_final) {
		this.end_date = fecha_final;
	}

	public LocalTime getHora_inicio() {
		return start_time;
	}

	public void setHora_inicio(LocalTime hora_inicio) {
		this.start_time = hora_inicio;
	}

	public LocalTime getHora_final() {
		return end_start;
	}

	public void setHora_final(LocalTime hora_final) {
		this.end_start = hora_final;
	}

	public Place getLugar() {
		return place;
	}

	public void setLugar(Place place) {
		this.place = place;
	}

	public int getCapacidad() {
		return ability;
	}

	public void setCapacidad(int capacidad) {
		this.ability = capacidad;
	}

	public int getParticipacion() {
		int cantidad = 0;

		for (User u : users) {
			if (u.getParticipation()) {
				cantidad++;
			}
		}

		return cantidad;
	}

	public void setParticipacion(int participacion) {
		this.stake = participacion;
	}

	private void addUsuario(User user) {
		if (users == null) {
			users = new ArrayList<User>();
		}
		users.add(user);
	}

	public ArrayList<User> getUsuarios() {
		return users;
	}

	public void setUsuarios(ArrayList<User> users) {
		this.users = users;
	}	
	
}
