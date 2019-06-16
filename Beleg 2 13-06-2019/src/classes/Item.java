package classes;

public abstract class Item implements Ibuyable{
	protected String prefix;
	protected String suffix;
	protected String itemname;
	protected String usetext = "";
	private int id;
	private static int Sid = 0;
	
	int gold = 0;

	public Item(String prefix, String suffix, String itemname, int gold) {
		super();
		this.prefix = prefix;
		this.suffix = suffix;
		this.itemname = itemname;
		this.gold = gold;
		this.id = Sid;
		Sid++;
	}
	
	public void use() {
		System.out.println(usetext);
	}

	public int getId() {
		return id;
	}

	public int getGold() {
		return gold;
	}


	
}
