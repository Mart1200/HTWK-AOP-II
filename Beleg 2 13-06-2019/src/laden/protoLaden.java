package laden;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import classes.Ibuyable;
import classes.Player;

public abstract class protoLaden {
	protected int gold = 0;
	protected Map<String, Ibuyable> inventar = new TreeMap<String, Ibuyable>();

	public protoLaden() {
		// TODO Auto-generated constructor stub
	}
	
	public void inventar() {
		System.out.println("BuyID || Item");
		
		for(String s: inventar.keySet()) {
			System.out.println(s + " ||  " + inventar.get(s));
		}
	}
	
	public void buy(String id, Player player) throws Exception {
		List<Ibuyable> pinventar = player.getInventarPlayer();
		Ibuyable i2= inventar.get(id);
		if(player.getGold() < i2.getGold()) {
			throw new noMoneyException("Kein Gold mehr");
		}else {
			pinventar.add(inventar.get(id));
			player.setInventarPlayer(pinventar);
			
			
			
			int neuesGold= i2.getGold();
			
			
			
			player.setGold(player.getGold() - neuesGold);
			gold+= inventar.get(id).getGold();
			inventar.remove(id);
		}
		
		
			
	}

	@Override
	public String toString() {
		String s = "[" + this.getClass().getSimpleName() + " | " + gold + "g]\n";
		s+="BuyID || Item\n";
		
		for(String s2: inventar.keySet()) {
			s+=s2 + " ||  " + inventar.get(s2)+"\n";
		}
		
		return s;
	}

	public Map<String, Ibuyable> getInventar() {
		return inventar;
	}
	
	public String bestPLItem() {
		String rid = "";
		double pl = 0.0;
		
		for(String id: inventar.keySet()) {
			if(pl < inventar.get(id).getPL()) {
				rid = id;
				pl = inventar.get(id).getPL();
			}
		}
		return rid;
	}
	

}
