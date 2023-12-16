package bsu.rfe.java.group5.lab1.Shaban.varB5;

import java.util.Comparator;

public class FoodComparator implements Comparator<Food> {
	@Override
	public int compare(Food arg0, Food arg1) {
		if(arg0==null || arg0 instanceof Cheese) return 1;
		if(arg1==null || arg1 instanceof Cheese) return -1;
		return arg0.getSize().compareTo(arg1.getSize());
	}
}
