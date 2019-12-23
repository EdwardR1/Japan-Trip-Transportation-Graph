package util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import datastructure.Node;
import datastructure.Route;
import cities.Location;

public class Printer {
	private HashMap<String, LinkedList<Node>> adjacencyMap;
	private Location location;

	public Printer(Location location) {
		this.location = location;
		this.adjacencyMap = location.getGraph().getAdjacencyMap();
	}

	private boolean pathExists(String LocationA, String LocationB) {
		if (!adjacencyMap.keySet().contains(LocationA)) {
			return false;
		}
		for (Node node : adjacencyMap.get(LocationA)) {
			if (node.getLocation().equalsIgnoreCase(LocationB)) {
				return true;
			}
		}
		return false;
	}

	public void printAllLocations() {
		Set<String> locations = adjacencyMap.keySet();
		System.out.println("Locations: ");
		for (String location : locations) {
			System.out.println("- " + location);
		}
	}

	private int getTime(String A, String B) {
		LinkedList<Node> nodes = adjacencyMap.get(A);
		for (Node node : nodes) {
			if (node.getLocation().equalsIgnoreCase(B)) {
				return node.getMinutes();
			}
		}
		return -1;
	}

	public void printPath(String A, String B) {
		if (!pathExists(A, B)) {
			// System.out.println("No Path Found!");
			return;
		} else {
			LinkedList<Route> routes = null;
			LinkedList<Node> nodes = adjacencyMap.get(A);
			for (int i = 0; i < nodes.size(); i++) {
				if (nodes.get(i).getLocation().equalsIgnoreCase(B)) {
					routes = nodes.get(i).getRoutes();
					break;
				}
			}
			if (routes == null) {
				// System.out.println("No Path Found!");
				return;
			} else {
				System.out.printf("Path from %s to %s with an overall travel time of %d mins:\n", A, B, getTime(A, B));
				System.out.print(A + " -> ");
				for (Route route : routes) {
					if (route.getStart().equals(A) && route.getEnd().equals(B)) {
						System.out.print(route.getRoute());
					} else if (route.getEnd().equals(B)) {
						if (!route.getRoute().equals("walk")) {
							System.out.printf("(From %s take %s to %s)", route.getStart(), route.getRoute(),
									route.getEnd());
						} else {
							System.out.printf("(From %s walk to %s)", route.getStart(), route.getEnd());
						}
					} else {
						System.out.printf("(From %s take the %s to %s)", route.getStart(), route.getRoute(),
								route.getEnd());
					}
					System.out.print(" -> ");
				}
				System.out.println(B);
			}
		}
	}

	public void printAllPaths() {
		Set<String> locations = adjacencyMap.keySet();
		System.out.println("Paths: ");
		for (String locationA : locations) {
			for (String locationB : locations) {
				if (!locationA.equalsIgnoreCase(locationB)) {
					if (pathExists(locationA, locationB)) {
						printPath(locationA, locationB);
						System.out.println();
					}
				}
			}
		}
	}

	public HashSet<String> getAllTransportation() {
		HashSet<String> transportation = new HashSet<String>();
		Set<String> locations = adjacencyMap.keySet();
		for (String location : locations) {
			LinkedList<Node> nodes = adjacencyMap.get(location);
			for (Node node : nodes) {
				LinkedList<Route> routes = node.getRoutes();
				for (Route route : routes) {
					if (!route.getRoute().equalsIgnoreCase("walk") && !route.getRoute().equalsIgnoreCase("cab")) {
						transportation.add(route.getRoute());
					}
				}
			}
		}
		return transportation;
	}

	public void printAllTransportation() {
		System.out.println("Transportation:");
		for (String transport : getAllTransportation()) {
			System.out.println("- " + transport);
		}
	}

	public void printHeading(){
		System.out.printf("City: %s\n\n", location.getLocationName());
	}

	public static void printDivider(){
		StringBuilder str = new StringBuilder();
		str.append("");
		int lim = 100;
		for(int i=0; i<lim; i++){
			str.append("=");
		}
		System.out.println(str.toString());
	}
}