package week1;


public class ClassVsObject {
	
//  Class is set of properties and methods which don't change during the execution of program, it's general concept
//	Object is created and can be destroyed, belong to a Class, property can be change,
	
	 public static int x = 7; 
	    public int y = 3; 
	    
	    public static void main(String[] args){
	    	ClassVsObject a =  new ClassVsObject();
	    	ClassVsObject b =  new ClassVsObject();
	    	a.y = 5;
	    	b.y = 6;
	    	a.x = 1;
	    	b.x = 2;
	    	System.out.println("a.y = " + a.y); //5
	    	System.out.println("b.y = " + b.y); //6
	    	System.out.println("a.x = " + a.x); //2
	    	System.out.println("b.x = " + b.x); // 2
	    	System.out.println("ClassVsObject.x = " + ClassVsObject.x); //2
	    }
}


