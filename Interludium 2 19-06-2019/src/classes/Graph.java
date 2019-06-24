package classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Graph {
	private Map<Integer, Vertex> vertices;
	private List<Edge> edges;
	private int knoten;

	public Graph(String dateipfad) throws FileNotFoundException {
		File f = new File(dateipfad);
		InputStream instream = new FileInputStream(f);
		Scanner reader = new Scanner(instream);
		
		List<Integer> pre = new ArrayList<Integer>();
		List<Integer> succ = new ArrayList<Integer>();
		List<Integer> weight = new ArrayList<Integer>();
		
		this.knoten = reader.nextInt();
		
		while(reader.hasNext()) {
			pre.add(reader.nextInt());
			succ.add(reader.nextInt());
			weight.add(reader.nextInt());
		}
		
		for(int i = 0; i < pre.size(); i++) {
			if(vertices.get(pre.get(i)) == null) {
				vertices.put(pre.get(i), new Vertex(pre.get(i)));
			}
		}
		
		for(int i = 0; i < succ.size(); i++) {
			if(vertices.get(succ.get(i)) == null) {
				vertices.put(succ.get(i), new Vertex(succ.get(i)));
			}
		}
		
		for(int i = 0; i < weight.size(); i++) {
			
		}
		
		
	}

	@Override
	public String toString() {
		return "Graph [vertices=" + vertices + ", edges=" + edges + ", knoten=" + knoten + "]";
	}
	
	

}
