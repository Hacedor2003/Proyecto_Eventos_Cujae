package logica;

import java.time.LocalDate;
import java.time.LocalTime;

public class EventFree extends Event {

	public EventFree(String name, String type, String organizer,
			LocalDate startDate, LocalDate finalDate, LocalTime startTime,
			LocalTime closingTime) {
		super(name, type, organizer, startDate, finalDate, startTime, closingTime);
		
	}

}
