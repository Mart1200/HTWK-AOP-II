package classes;

public abstract class Waffe implements IItem{
	int schaden = 0;
	String prefix = "";
	String sufix = "";
	String Waffe = "";
	int kosten;
	
	public Waffe(int schaden, String prefix, String sufix, String waffe, int kosten) {
		this.schaden = schaden;
		this.prefix = prefix;
		this.sufix = sufix;
		this.Waffe = waffe;
		this.kosten = kosten;
	}
	
	@Override
	public void use() {
		System.out.println("Greift an mit ["+ prefix + " " + Waffe + " " + sufix + "] und verursacht " + schaden + " Schaden");
	} 
	
	
	
	

}
