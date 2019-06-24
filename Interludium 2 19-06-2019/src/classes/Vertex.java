package classes;

import java.util.List;

public class Vertex {
	private int index;
	private List<Edge> pred;
	private List<Edge> succ;
	
	public Vertex(int index) {
		this.index = index;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public List<Edge> getPred() {
		return pred;
	}

	public void setPred(List<Edge> pred) {
		this.pred = pred;
	}

	public List<Edge> getSucc() {
		return succ;
	}

	public void setSucc(List<Edge> succ) {
		this.succ = succ;
	}
	
	public void addPred(Edge e) {
		pred.add(e);
	}
	
	public void addSucc(Edge e) {
		succ.add(e);
	}

}
