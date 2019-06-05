package Classes;

import java.util.Random;

public abstract class Gaststaette implements IEatable{

	public Gaststaette(){
		// TODO Auto-generated constructor stub
	}
	
	public abstract String getFood();
	
	public static IEatable faktoryGaststaette() {
		Random r = new Random();
		
		int p = r.nextInt(3);
		
		switch(p) {
		case 0: return new Pizzeria();
		case 1: return new SushiBar();
		case 2: return new WuerstchenBude();
		default: System.out.println("Fehler");
			return null;
		}
		
	}
	

}
