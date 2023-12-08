package logica;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public interface Modifier {
	
	ArrayList<Event> modify(Event searchEvent, String name, String type,
			String organizer, LocalDate startDate, LocalDate finalDate,
			LocalTime startTime, LocalTime closingTime, Place place,
			ArrayList<Event> events);

}
