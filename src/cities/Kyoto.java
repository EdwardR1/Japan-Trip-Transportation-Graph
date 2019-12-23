package cities;

import java.util.LinkedList;

import datastructure.Graph;
import datastructure.Node;
import datastructure.Route;

public class Kyoto implements Location {
	Graph graph = new Graph();

	public String getLocationName(){
		return this.getClass().getSimpleName();
	}

	public Graph getGraph() {
		return graph;
	}

	public void setup() {
		graph.addEdge(new Node("Kyoto Station", 25, new LinkedList<Route>() {
			{
				add(new Route("Kyoto Station", "walk", "Hotel Mokuren"));
			}
		}), "Hotel Mokuren");

		graph.addEdge(new Node("Hotel Mokuren", 15, new LinkedList<Route>() {
			{
				add(new Route("Kiyomizo-Gojo Station", "Keihan Main Line", "Fushimi-Inari Station"));
			}
		}), "Fushimi Inari Taishi");

		graph.addEdge(new Node("Hotel Mokuren", 51, new LinkedList<Route>() {
			{
				add(new Route("Kawaramachi Gojo", "205 Bus", "Kinkakujimichi"));
			}
		}), "Kinkakuji");

		graph.addEdge(new Node("Kinkakuji", 50, new LinkedList<Route>() {
			{
				add(new Route("Kinkakuji-mae", "12 Bus", "Horikawa Marutamachi"));
				add(new Route("Horikawa Marutamachi", "202 Bus", "Kiyomizumichi"));
			}
		}), "Yasaka Pagoda");

		graph.addEdge(new Node("Hotel Mokuren", 15, new LinkedList<Route>() {
			{
				add(new Route("Hotel Mokuren", "walk", "Yasaka Pagoda"));
			}
		}), "Yasaka Pagoda");

		graph.addEdge(new Node("Hotel Mokuren", 35, new LinkedList<Route>() {
			{
				add(new Route("Tambaguchi Station", "San-In Line", "Saga-Arashiyama Station"));
			}
		}), "Arashiyama Bamboo Groove");
		graph.addEdge(new Node("Hotel Mokuren", 40, new LinkedList<Route>() {
			{
				add(new Route("Sai Station", "Randen Line", "Arashiyama Station"));
			}
		}), "Arashiyama Bamboo Groove");
		graph.addEdge(new Node("Hotel Mokuren", 96, new LinkedList<Route>() {
			{
				add(new Route("Kyoto Station", "JR Hikari", "Himeji Station"));
			}
		}), "Himeji Castle");

		graph.addEdge(new Node("Hotel Mokuren", 53, new LinkedList<Route>() {
			{
				add(new Route("Gojo Keihan", "82 Bus", "Shijo Omiya"));
				add(new Route("Shijo Omiya", "Randen (Local Arashiyama)", "Arashiyama Station"));
			}
		}), "Tenryuji Temple");
	}

}