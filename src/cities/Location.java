package cities;

import datastructure.Graph;

public interface Location {
	public String getLocationName();

	public void setup();

	public Graph getGraph();
}