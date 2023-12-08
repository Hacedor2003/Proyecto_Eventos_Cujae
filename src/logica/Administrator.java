package logica;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Administrator extends User implements Remover, Modifier, Creator {

	public Administrator(String name, String lastName, String telephone_number,
			String nombreUsuario, String contrasena, Area area, String ID,
			int permissionLvl) {
		super(name, lastName, telephone_number, nombreUsuario, contrasena,
				area, ID);
		this.permissionLvl = permissionLvl;
	}

	private int permissionLvl;

	public ArrayList<Event> modify(Event searchEvent, String name, String type,
			String organizer, LocalDate startDate, LocalDate finalDate,
			LocalTime startTime, LocalTime closingTime, Place place,
			ArrayList<Event> events) {

		boolean found = false;
		Event event = null;

		for (int i = 0; i < events.size() && !found; i++) {
			event = events.get(i);
			if (event.getNombre_evento().equals(searchEvent.getNombre_evento()))
				if (event.getTipo_evento().equals(searchEvent.getTipo_evento())) {
					event.setNombre_evento(name);
					event.setTipo_evento(type);
					event.setOrganizador(organizer);
					event.setFecha_inicio(startDate);
					event.setFecha_final(finalDate);
					event.setHora_inicio(startTime);
					event.setHora_final(closingTime);
					event.setLugar(place);
					found = true;
				}
		}
		return events;
	}

	public boolean remove(Event searhEvent, ArrayList<Event> events) {
		boolean found = false;
		Event event = null;

		for (int i = 0; i < events.size() && !found; i++) {
			event = events.get(i);
			if (event.getNombre_evento().equals(searhEvent.getNombre_evento()))
				if (event.getTipo_evento().equals(searhEvent.getTipo_evento())) {
					events.remove(i);
					found = true;
				}
		}
		return found;
	}

	public void addEvent(String name, String type, String organizer,
			LocalDate startDate, LocalDate finalDate, LocalTime startTime,
			LocalTime closingTime, Place place) {

	}

	public int getPermissionLvl() {
		return permissionLvl;
	}

	public void setPermissionLvl(int permissionLvl) {
		if (permissionLvl == 1 || permissionLvl == 2 || permissionLvl == 3)
			this.permissionLvl = permissionLvl;
		else
			throw new IllegalArgumentException(
					"ERROR: Nivel de permiso no definido");
	}

	public void create(String name, String type, String organizer,
			LocalDate startDate, LocalDate finalDate, LocalTime startTime,
			LocalTime closingTime, Place place, int capacity) {

	}


}
