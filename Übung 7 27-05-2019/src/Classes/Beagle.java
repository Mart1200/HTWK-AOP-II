package Classes;

public class Beagle extends Canoidea implements iHaustier{
	String name, Laut = "WauWau";
	
	public Beagle() {
		super();
		art = this.getClass().getSimpleName();
		futter = "Hundefutter";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public void streicheln() {
		// TODO Auto-generated method stub
		System.out.println(this.getLaut());
	}

	@Override
	public String getLaut() {
		// TODO Auto-generated method stub
		return Laut;
	}
	
}
