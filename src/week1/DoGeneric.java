package week1;

import java.util.ArrayList;
import java.util.List;

public class DoGeneric {
	//Generic Method
	

	public static void main(String[] args) {
		GenericsInterface<String, Integer> p1 = new GenericPair("John", 01243124);
		GenericsInterface<String, Integer> p2 = new GenericPair("Mary", 424242);
		
		String name = GenericMethod.getKey(p1);
		int phone = GenericMethod.getValue(p1);
		
//		String name = p1.getKey();
//		int phone = p1.getValue();
		System.out.println(name + " has " + phone);
		
		
		//Bounded Wildcard example
		//
		List<? extends Number> list = new ArrayList<Integer>();
		
		
	}

	
}
