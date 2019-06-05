package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.List;

import Classes.*;

public class main {
	public static void main(String[] args) {
		
		Map<String, List<IEatable>> gstmap = new TreeMap<String, List<IEatable>>(); //oder Hashmap
		
		String[] straﬂen = {"Straﬂe 1", "Straﬂe 2","Straﬂe 3","Straﬂe 4","Straﬂe 5", "Straﬂe 1"};
		
		for(String s: straﬂen) {
			
			if(!gstmap.containsKey(s)) {
				List<IEatable> list = new LinkedList<IEatable>();
				Random r = new Random();
				int ri = r.nextInt(6) +5;
				
				for(int i = 1; i <= ri; i++) {
					list.add(Gaststaette.faktoryGaststaette());
				}
				
				gstmap.put(s, list);
			}	
		}
	
	System.out.println(gstmap.size());
	
	for(String c: gstmap.keySet()) {
		
//		for(IEatable e: gstmap.get(c)) {
//			System.out.println(c + "   " + e.getFood());
//		}
		
		Iterator<IEatable> it = gstmap.get(c).iterator();
		
		while(it.hasNext()) {
			System.out.println(c + "   " + it.next().getFood());
		}
		
	}
	
	
	}

}
