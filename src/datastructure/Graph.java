package datastructure;

import java.util.HashMap;
import java.util.LinkedList;

public class Graph {
	private HashMap<String, LinkedList<Node>> adjacencyMap;

	public Graph() {
		this.adjacencyMap = new HashMap<String, LinkedList<Node>>();
	}

	public HashMap<String, LinkedList<Node>> getAdjacencyMap() {
		return adjacencyMap;
	}

	public void addLocation(String location) {
		adjacencyMap.put(location, new LinkedList<Node>());
	}

	public void addEdge(Node A, Node B) {
		if (adjacencyMap.get(A.getLocation()) == null) {
			addLocation(A.getLocation());
		}
		if (adjacencyMap.get(B.getLocation()) == null) {
			addLocation(B.getLocation());
		}
		adjacencyMap.get(A.getLocation()).add(B);
		adjacencyMap.get(B.getLocation()).add(A);
	}

	public void addEdge(Node A, String B) {
		if (!adjacencyMap.keySet().contains(A.getLocation())) {
			addLocation(A.getLocation());
		}
		if (!adjacencyMap.keySet().contains(B)) {
			addLocation(B);
		}

		adjacencyMap.get(A.getLocation()).add(new Node(B, A.getMinutes(), A.getRoutes()));
		adjacencyMap.get(B).add(A);

	}
}
