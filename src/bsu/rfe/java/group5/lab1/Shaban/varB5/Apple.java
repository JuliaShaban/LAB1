package bsu.rfe.java.group5.lab1.Shaban.varB5;

public class Apple extends Food {

public String size;
	
	public Apple (String size) {
		super("Apple");
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
		if (!(arg0 instanceof Apple)) return false;
		return size.equals(((Apple)arg0).size);
    }

	@Override
	public String toString() {
		return "An "+super.toString()+" of '"+size.toUpperCase()+"' size ";
    }
	
	@Override
	public int calculateCalories() {
		int calories=0;
		switch(size) {
		case "big":
			calories=141;
			break;
		case "average":
			calories=94;
			break;
		case "small":
			calories=47;
		}
		return calories;
	}

}


