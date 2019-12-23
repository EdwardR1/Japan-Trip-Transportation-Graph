package datastructure;

import java.util.LinkedList;

public class Node {
	private String location;
	private int minutes;
	private LinkedList<Route> routes;

	public Node(String location, int minutes, LinkedList<Route> routes) {
		this.location = location;
		this.minutes = minutes;
		this.routes = routes;
	}

	public LinkedList<Route> getRoutes() {
		return this.routes;
	}

	public void setRoutes(LinkedList<Route> routes) {
		this.routes = routes;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
}