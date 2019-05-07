package Risiko;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Player {
	private int Steine;
	private int[] Wurfel = new int[3];
	private String name = "";
	
	public Player(int steine, String playername) {
		Steine = steine;
		name = playername;
	}

	@Override
	public String toString() {
		return name + " Steine:" + Steine + ", Wurfel:" + Arrays.toString(Wurfel);
	}
		
	public int getSteine() {
		return Steine;
	}

	public void setSteine(int steine) {
		Steine = steine;
	}

	public int[] getWurfel() {
		return Wurfel;
	}

	public void setWurfel(int[] wurfel) {
		Wurfel = wurfel;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void wurfeln() {
		if(Steine < 3) {
			Wurfel = new int[Steine];
		}
		
		Random zufall = new Random();
		int k;
		int temp;
		
//		if(Steine >= 3) {
//			k = 3;
//		}else {
//			k = Steine;
//		}
		
		for(int i = 0; i < Wurfel.length; i++) { //for(int i = 0; i < k; i++) {
			Wurfel[i] = zufall.nextInt(6) + 1;
		}
		

		Arrays.sort(Wurfel);
		
		for( int i = 0; i < Wurfel.length/2; ++i ) 
		{ 
		  temp = Wurfel[i]; 
		  Wurfel[i] = Wurfel[Wurfel.length - i - 1]; 
		  Wurfel[Wurfel.length - i - 1] = temp; 
		}
	}
	
	public void attack(Player defender) {
		this.wurfeln();
		defender.wurfeln();
		
		System.out.println(this.getName() + " greift " + defender.getName() + " an!");
		
		int[] wd = defender.getWurfel();
		int k;
		
		if(wd.length < Wurfel.length){
			k = wd.length;
		}else {
			k = Wurfel.length;
		}
		
		for(int i = 0; i < k; i++) {
			if(wd[i] < Wurfel[i]) {
				defender.setSteine(defender.getSteine() - 1);
			}else{
				Steine = Steine - 1;
			}
		}
			
	}
	
}
