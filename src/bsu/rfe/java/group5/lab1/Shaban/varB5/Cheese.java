package bsu.rfe.java.group5.lab1.Shaban.varB5;

public class Cheese extends Food {

	public Cheese() {
		super("Cheese");
	}

	@Override
	public void consume(int count) {
		System.out.println(this +" was eaten "+count+ " times");
	}

	@Override
	public int calculateCalories() {
		return 350;
		
	}
}
