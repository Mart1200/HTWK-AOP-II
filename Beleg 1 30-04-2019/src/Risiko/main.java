package Risiko;

public class main {

	public static void main(String[] args) {
		Player p1 = new Player(7 , "Wilhelm I");
		Player p2 = new Player(7 , "Friedrich III");
		
		int zuege = 1;
		
		System.out.println("Anfang: ");
		System.out.println("P1 " + p1);
		System.out.println("P2 " + p2 + "\n");
		
		while(true) {		
			p1.attack(p2);		
						
			if(p1.getSteine() > 0 && p2.getSteine() > 0) {
				System.out.println("Zug " + zuege);
				System.out.println(p1);
				System.out.println(p2 + "\n");
			}else {
				System.out.println("Endstand: ");
				System.out.println(p1);
				System.out.println(p2);
				break;
			}
			
			p2.attack(p1);		
			
			if(p1.getSteine() > 0 && p2.getSteine() > 0) {
				System.out.println("Zug " + zuege);
				System.out.println(p1);
				System.out.println(p2 + "\n");
			}else {
				System.out.println("Endstand: ");
				System.out.println(p1);
				System.out.println(p2);
				break;
			}
			
			zuege++;
		}
		
	}

}
