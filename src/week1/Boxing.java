package week1;

import java.util.ArrayList;
import java.util.List;

public class Boxing {
	//auto boxing:  converting the primitive types and their corresponding object wrapper classes
				//	- Passed as a parameter to a method that expects an object of the corresponding wrapper class.
				//	- Assigned to a variable of the corresponding wrapper class.
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		for (int i = 1; i < 50; i += 2)
		    li.add(i); //autoboxing: li.add(Integer.valueOf(i));
		
		
		

	}
	//unboxing:
		//-Passed as a parameter to a method that expects a value of the corresponding primitive type.
		//- Assigned to a variable of the corresponding primitive type.
	public static int sumEven(List<Integer> li) {
	    int sum = 0;
	    for (Integer i: li)
	        if (i % 2 == 0)
	            sum += i; // unboxing: sum += i.intValue();
	        return sum;
	}

}
