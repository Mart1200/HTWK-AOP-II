import java.util.Random;

public class main {
	static Random zufall = new Random();
	
	public static void genDeck(Card[] Deck) {
		final String[] farben = {"Kreuz", "Pik", "Herz", "Karo"};
		final String[] werte = {"Ass", "König", "Dame", "Bube", "10", "9", "8", "7"};
		
		int i = 0;
		
		for(String f: farben) {
			for(String w: werte) {
				Deck[i] = new Card();
				Deck[i].setFarbe(f);
				Deck[i].setWert(w);
				i++;
			}
		}
	}
	
	private static void printDeck(Card[] deck) {
		for(int i = 0; i < deck.length; i++) {
			System.out.println(deck[i]);
		}
		
	}
	
	private static void DeckMischen(Card[] deck, int schritte) {
		for(int i = 0; i < schritte; i++) {
			int m = zufall.nextInt(deck.length);
			int n = zufall.nextInt(deck.length);
			
			if(m != n) {
				Card temp = deck[m];
				deck[m] = deck[n];
				deck[n] = temp;
			}
			
		}
	}
	
	private static void geben(Card[] Deck, Card[] Player1, Card[] Player2, Card[] Player3, Card[] Skat) {
		for(int i = 0; i < 10; i++ ) {
			Player1[i] = Deck[0 + i];
			Player2[i] = Deck[10 + i];
			Player3[i] = Deck[20 + i];
		}
		
		Skat[0] = Deck[30];
		Skat[1] = Deck[31];
		
	}

	public static void main(String[] args) {
		
		Card[] deck = new Card[32];
		Card[] Player1 = new Card[10];
		Card[] Player2 = new Card[10];
		Card[] Player3 = new Card[10];
		Card[] Skat = new Card[2];
		
		genDeck(deck);
		DeckMischen(deck, 10000);
		
		geben(deck, Player1, Player2, Player3, Skat);
		
		System.out.println("Spieler 1: ");
		printDeck(Player1);
		
		System.out.println("Spieler 2: ");
		printDeck(Player2);
		
		System.out.println("Spieler 3: ");
		printDeck(Player3);
		
		System.out.println("Skat: ");
		printDeck(Skat);
		
		
	}

}
