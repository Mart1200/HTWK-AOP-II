package Classes;

import java.util.ArrayList;

public class Gehege <T extends Zootier>{
	private ArrayList<T> items = new ArrayList<T>();
	
	public Gehege() {
		// TODO Auto-generated constructor stub
	}
	
	public void add(T item) {
		items.add(item);
	}

}
