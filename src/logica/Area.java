package logica;

import java.util.ArrayList;

public class Area {
	private String name;
	private ArrayList<User> user;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<User> getUser() {
		return user;
	}
	public void setUser(ArrayList<User> user) {
		this.user = user;
	}
	public Area(String name, ArrayList<User> user) {
		this.name = name;
		this.user = user;
	}
	
}
