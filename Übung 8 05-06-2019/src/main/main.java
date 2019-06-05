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
		
		String[] stra�en = {"Stra�e 1", "Stra�e 2","Stra�e 3","Stra�e 4","Stra�e 5", "Stra�e 1"};
		
		for(String s: stra�en) {
			
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
