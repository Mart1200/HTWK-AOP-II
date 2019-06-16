package classes;

import java.util.ArrayList;
import java.util.List;

import laden.Buchladen;
import laden.Juwelier;
import laden.Waffen;
import laden.protoLaden;

public class Player {
	private int gold = 1000;
	private String name;
	private List<Ibuyable> inventarPlayer = new ArrayList<Ibuyable>();
	private int stärke = 1;
	
	public Player(String name) {
		this.name = name;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public List<Ibuyable> getInventarPlayer() {
		return inventarPlayer;
	}

	public void setInventarPlayer(List<Ibuyable> inventarPlayer) {
		this.inventarPlayer = inventarPlayer;
	}

	@Override
	public String toString() {
		this.update();
		String s = "[" + name +"|" + gold + "g|" + stärke +" Stärke]\n";
		try {
			for(Ibuyable i: inventarPlayer) {
				s = s + i + "\n";
			}
		} catch (Exception e) {
			s = s + "nix im Inventar!";
		}
		return s;
	}
	
	public void buyForMe(Waffen schmied, Juwelier juwelier, Buchladen buchladen, String focus) {
		try {
			schmied.buy(schmied.bestPLItem(), this);
			juwelier.buy(juwelier.bestPLItem(), this);
			buchladen.buy(buchladen.bestPLItem(), this);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		this.focusbuy(schmied, juwelier, buchladen, focus);
		if(gold> 0) {
			this.focusbuy(schmied, juwelier, buchladen, "Juwelier");
		}
		if(gold> 0) {
			this.focusbuy(schmied, juwelier, buchladen, "Buchladen");
		}
		
		
	}
	
	private void focusbuy(Waffen schmied, Juwelier juwelier, Buchladen buchladen, String focus) {
		if(focus.equals("Schmied")) {
			while(gold > 0 && schmied.getInventar().size() != 0) {
				try {
					schmied.buy(schmied.bestPLItem(), this);
				} catch (Exception e) {
					break;
				}
			}
		}else if(focus.equals("Juwelier")) {
			while(gold > 0 && juwelier.getInventar().size() != 0) {
				try {
					juwelier.buy(juwelier.bestPLItem(), this);
				} catch (Exception e) {
					break;
				}
			}
		}else if(focus.equals("Buchladen")) {
			while(gold > 0 && buchladen.getInventar().size() != 0) {
				try {
					buchladen.buy(buchladen.bestPLItem(), this);
				} catch (Exception e) {
					break;
				}
			}
		}else {
			System.out.println("!FEHLER! Focus beim Kaufen nicht erkannt");
		}
	}
	
	public void update() {
		int neuStärke = 1;
		
		for(Ibuyable i: inventarPlayer) {
			if(i instanceof classes.Silberring) {
				neuStärke += ((classes.Silberring) i).getstärke();
			}
		}
		
		if(neuStärke != stärke) {
			stärke=neuStärke;
		}
	}
	
	public void useAll() {
		this.update();
		
		for(Ibuyable i: inventarPlayer) {
			if(i instanceof classes.Waffe) {
				((classes.Waffe) i).use();
				System.out.println(" x" + stärke);
			}else {
				
				try {
					i.use();
				} catch (Exception e) {
					System.out.println("!!!!!Fehler!!!!!!!");
				}

			}
		}
	}
	
	
	
	
	
	
	
}
