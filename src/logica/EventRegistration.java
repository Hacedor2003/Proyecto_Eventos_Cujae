package logica;

import java.time.LocalDate;
import java.time.LocalTime;

public class EventRegistration extends Event {
	
	private int capacity;
	
	public EventRegistration(String name, String type, String organizer,
			LocalDate startDate, LocalDate finalDate, LocalTime startTime,
			LocalTime closingTime, int capacity) {
		super(name, type, organizer, startDate, finalDate, startTime, closingTime);
		this.setCapacity(capacity);
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	

}
