package week1;

public class NestedDemo {
	
	public static void main(String[] args) {
		//Demo nested class
		NestedClass outer = new NestedClass();
		outer.display_Inter();
		
		//Demo access private member
		NestedClass.InnerDemo2 inner = outer.new InnerDemo2();
		System.out.println("private num: "+ inner.getNum());
		
		//Demo method-local inner
		outer.methodLocalInner();
		
		//Demo anonymous inner
		NestedClass.AnonymouseInner anony = outer.new AnonymouseInner() {
			
			@Override
			public void abstractMethod() {
				System.out.println("This is anonymous inner class");
				
			}
		};
		anony.abstractMethod();
		
		//Demo static nested class
		NestedClass.StaticNestedDemo nested = new NestedClass.StaticNestedDemo();
		nested.nestedMethod();
		
	}
	
	

}
