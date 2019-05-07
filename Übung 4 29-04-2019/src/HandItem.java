
public class HandItem {
	private Card card;
	private boolean played = false;
	
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	
	public boolean isGespielt() {
		return played;
	}
	
	@Override
	public String toString() {
		return card + " " + played;
	}
	public Card KarteSpielen(){
		played = true;
		return card;
	}
	
}
