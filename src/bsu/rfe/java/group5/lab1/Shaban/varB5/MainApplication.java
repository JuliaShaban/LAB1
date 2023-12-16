package bsu.rfe.java.group5.lab1.Shaban.varB5;

import java.util.Arrays;

public class MainApplication {

	public static void main(String[] args) throws Exception {
		Food[] breakfast = new Food[20];
		int itemsSoFar = 0, count=1;
		boolean SameItem=false;
		for (String arg: args) {
			  String[] parts = arg.split("/");
		      if (parts[0].equals("Cheese")) 
		            breakfast[itemsSoFar] = new Cheese();
		      else
		      if (parts[0].equals("Apple"))
		            breakfast[itemsSoFar] = new Apple(parts[1]);
		      else
		      if (parts[0].equals("Hamburger"))
		            breakfast[itemsSoFar] = new Burger(parts[1]);
		     
		      itemsSoFar++;
		}
		
		for(int i=0; i<breakfast.length; i++) 
		      if (breakfast[i]!=null) {
		    	  for(int k=0; k<i; k++)
		              if (breakfast[i].equals(breakfast[k])) {
			              SameItem=true;
			              break;
		              }
		    	  for(int j=i+1; j<breakfast.length; j++) {
		    		  if (breakfast[j]!=null) {
		    		  if (breakfast[i].equals(breakfast[j]))
		  				count++;
		    		  }
		    	  }
		    	  if(SameItem==false) {
		    	  breakfast[i].consume(count);
		    	  count=1;
		    	  }
		    	  else {
		    		  SameItem=false;
		    		  continue;
		    	  }
		      } else
		           break;
		
		for(String arg : args) {
			if(arg!=null)
			    switch (arg) {
		     	case "-sort":
				    Arrays.sort(breakfast, new FoodComparator());
				    break;
		    	case "-calories":
				    int calories=0;
		    	    for(Food item: breakfast) {
				        if(item!=null)
				        calories+=item.calculateCalories();
		    	}
			        System.out.println("The breakfast contains "+calories+" calories");	
			break;
			default:
			break;
			}			
	    }
		System.out.println("\nSorted breakfast:");
		for(Food item: breakfast)
			if(item!=null)
				System.out.println(item.toString());
		System.out.println("Have a nice day!");
}
	
}
