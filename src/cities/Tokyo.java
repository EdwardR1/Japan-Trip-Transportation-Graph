package cities;

import java.util.LinkedList;

import datastructure.Graph;
import datastructure.Node;
import datastructure.Route;

public class Tokyo implements Location {
	Graph graph = new Graph();

	public String getLocationName(){
		return this.getClass().getSimpleName();
	}

	public Graph getGraph(){
		return graph;
	}
	public void setup(){
		graph.addEdge(new Node("Hotel Daiichi", 30, new LinkedList<Route>(){{
			add(new Route("Ginza Station", "(M) Marunuochi Line", "Shinjuku Station"));
		}}), "Robot Restaurant (A)");
		graph.addEdge(new Node("Hotel Daiichi", 25, new LinkedList<Route>(){{
			add(new Route("Shimbashi Station", "(G) Ginza Line", "Akasaka Mitsuke Station"));
			add(new Route("Akasaka Mitsuke Station", "(M) Marunuochi Line", "Shinjuku Station"));
		}}), "Robot Restaurant (B)");

		graph.addEdge(new Node("Hotel Daiichi", 20, new LinkedList<Route>(){{
			add(new Route("Shimbashi Station", "(G) Ginza Line", "Suchirocho Station"));
		}}), "Akihabara (A)");

		graph.addEdge(new Node("Robot Restaurant (A)", 33, new LinkedList<Route>(){{
			add(new Route("Shinjuku Station", "[JB] Chuo-Sobu Line", "Akihabara Station"));
		}}), "Akihabara (A)");
		
		graph.addEdge(new Node("Robot Restaurant (A)", 35, new LinkedList<Route>(){{
			add(new Route("Shinjuku-Hishiguchi Station", "(E) Oedo Line", "Ueno-Okachimachi"));
		}}), "Akihabara (B)");

		graph.addEdge(new Node("Hotel Daiichi", 27, new LinkedList<Route>() {{
			add(new Route("Shimbashi Station", "(U) Yurikamome Line", "Aomi Station"));
		}}), "TeamLab Borderless");

		graph.addEdge(new Node("Hotel Daiichi", 11, new LinkedList<Route>(){{
			add(new Route("Hotel Daiichi", "Walk", "Tokaido Shinkansen"));
		}}), "Tokaido Shinkansen");

		graph.addEdge(new Node("Hotel Daiichi", 18, new LinkedList<Route>(){{
			add(new Route("Hotel Daiichi", "Walk", "Fish Market"));
		}}), "Fish Market");
	}
}