package datastructure;

public class Route {
	private String start, route, end;
	private double cost;

	public Route(String start, String route, String end, double cost) {
		this.start = start;
		this.route = route;
		this.end = end;
	}
	public Route(String start, String route, String end) {
		this.start = start;
		this.route = route;
		this.end = end;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public String getEnd() {
		return end;
	}

	public void setCost(double cost){
		this.cost = cost;
	}

	public double getCost(){
		return cost;
	}

	public void setEnd(String end) {
		this.end = end;
	}
}