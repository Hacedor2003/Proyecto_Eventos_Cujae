package logica;

import java.time.LocalDate;
import java.time.LocalTime;

public interface Creator {
		
	void create(String name, String type, String organizer,
			LocalDate startDate, LocalDate finalDate, LocalTime startTime,
			LocalTime closingTime,Place place, int capacity);
	
}
