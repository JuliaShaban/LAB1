package bsu.rfe.java.group5.lab1.Shaban.varB5;

public class Burger extends Food {

private String size;
	
	public Burger(String size) {
		super("Hamburger");
		this.size=size;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public void consume(int count) {
		System.out.println(this+" was eaten "+count+ " times");
	}

	@Override
	public boolean equals(Object arg0) {
		if(!super.equals(arg0)) return false;
		if (!(arg0 instanceof Burger)) return false;
		return size.equals(((Burger)arg0).size);
	}

	@Override
	public String toString() {
		return "A "+super.toString()+" of '"+size.toUpperCase()+"' size";
	}

	@Override
	public int calculateCalories() {
		int calories=0;
		switch(size) {
		case "big":
			calories=528;
			break;
		case "average":
			calories=396;
			break;
		case "small":
			calories=264;
			break;
		}
		return calories;
	}
	
	

}
