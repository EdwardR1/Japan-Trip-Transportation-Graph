package cities;

import java.util.LinkedList;

import datastructure.Graph;
import datastructure.Node;
import datastructure.Route;

public class Osaka implements Location {
	Graph graph = new Graph();

	public String getLocationName(){
		return this.getClass().getSimpleName();
	}

	public Graph getGraph() {
		return graph;
	}

	public void setup() {
		graph.addEdge(new Node("Shin Osaka Station", 50, new LinkedList<Route>() {
			{
				add(new Route("Shin Osaka Station", "Cab", "Osaka Guest House Sano San Chi Yu"));
			}
		}), "Osaka Guest House Sano San Chi Yu");

		graph.addEdge(new Node("Osaka Guest House Sano San Chi Yu", 44, new LinkedList<Route>() {
			{
				add(new Route("Izumosano Station", "Nankai-Limited Express Line", "Namba Station"));

			}
		}), "Kuromon Market");

		graph.addEdge(new Node("Osaka Guest House Sano San Chi Yu", 44, new LinkedList<Route>() {
			{
				add(new Route("Izumosano Station", "Nankai-Limited Express Line", "Namba Station"));
			}
		}), "Dotonburi");
		graph.addEdge(new Node("Kuromon Market", 12, new LinkedList<Route>() {
			{
				add(new Route("Kuromon Market", "Walk", "Dotonburi"));
			}
		}), "Dotonburi");

		graph.addEdge(new Node("Dotonburi", 27, new LinkedList<Route>() {
			{
				add(new Route("Dotonburi", "Walk", "Shinsekai"));
			}
		}), "Shinsekai");

		graph.addEdge(new Node("Osaka Guest House Sano San Chi Yu", 42, new LinkedList<Route>() {
			{
				add(new Route("Izumosano Station", "Nankai-Limited Express Line", "Shin-Imamiya Station"));
			}
		}), "Shinsekai");

		graph.addEdge(new Node("Osaka Guest House Sano San Chi Yu", 72, new LinkedList<Route>() {
			{
				add(new Route("Izumosano Station", "Nankai Line", "Tengachaya Station"));
				add(new Route("Tengachaya Station", "Sakaisuji Station", "Sakaisuji Hommachi Station"));
				add(new Route("Sakaisuji Hommachi Station", "Chuo Line", "Tanimachiyachome Station"));
			}
		}), "Osaka Castle");

		graph.addEdge(new Node("Osaka Guest House Sano San Chi Yu", 57, new LinkedList<Route>() {
			{
				add(new Route("Izumosano Station", "Nankai Line", "Shin-Imamiyo Station"));
				add(new Route("Shin-Imamiyo Station", "Osaka Loop", "Tennoji Station"));
			}
		}), "Shitennoji");
	}

}