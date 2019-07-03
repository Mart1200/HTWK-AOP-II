package classes;

import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class LottoDaten {
	Map<Integer, Set<Integer>> daten;

	public LottoDaten() {
		daten = new TreeMap<Integer, Set<Integer>>();
	}
	
	public void add(Integer n) {
		Random r = new Random();
		Set<Integer> nS = new TreeSet<Integer>();
		
		for(int i = 0; i < 6; i++) {
			int ir = r.nextInt(49)+1;
			while(nS.contains(ir)) {
				ir = r.nextInt(49)+1;
			}
			nS.add(ir);
		}
		
		daten.put(n, nS);
		
	}

	
	
	
}
