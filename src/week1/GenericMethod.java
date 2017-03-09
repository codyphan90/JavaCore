package week1;

import java.util.ArrayList;

public class GenericMethod {
	 	//generic method
	   public static <K, V> K getKey(GenericsInterface<K, V> entry) {
	       K key = entry.getKey();
	       return key;
	   }
	 
	   
	   public static <K, V> V getValue(GenericsInterface<K, V> entry) {
	       V value = entry.getValue();
	       return value;
	   }
	 
	   
	   public static <E> E getFirstElement(ArrayList<E> list) {
	        E first = list.get(0);
	       return first;
	   }

}
