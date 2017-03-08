package week1;

public class NestedClass {

	// Inner Class Example
	private class InnerDemo {
		public void print() {
			System.out.println("This is an inner class");
		}
	}
		// access inner class
	public void display_Inter() {
		InnerDemo inner = new InnerDemo();
		inner.print();
	}

		// access private members Example
	private int num = 2017;

	public class InnerDemo2 {
		public int getNum() {
			return num;
		}
	}

	// Method-local Inner Class Example
	public void methodLocalInner() {
		int num2 = 2018;
		// class method-local inner
		class MethodInnerDemo {
			public void print() {
				System.out.println("this is method-local inner class");
			}
		}
		
		// access inner class
		MethodInnerDemo inner = new MethodInnerDemo();
		inner.print();
	}
	
	//Anonymous Inner Class (used to override method or class/interface)
	 abstract class AnonymouseInner {
		public abstract void abstractMethod();
	}
	
	 //Static nested class
		public static class StaticNestedDemo{
			public void nestedMethod(){
				System.out.println(" this is nested class");
			}
		}

}
