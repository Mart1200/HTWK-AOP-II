package classes;

public class Edge {
	private Vertex from;
	private Vertex to;
	private int weight;
	
	public Edge(Vertex from, Vertex to, int weight) {
		this.from = from;
		this.to = to;
		this.weight = weight;
	}

}
