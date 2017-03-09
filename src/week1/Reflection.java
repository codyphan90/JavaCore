package week1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
		Class<Student> classStudent = Student.class;
		//name
		System.out.println("name class = " + classStudent.getName());
		//methods
		Method[] methods = classStudent.getMethods();
		for (Method method : methods) {
			System.out.println("method: " + method.getName());
		}
		//AccessPrivateFieldExample
		Field privateField = classStudent.getDeclaredField("name");
		privateField.setAccessible(true);
		
		
		Student s1 = new Student(1,"A",24);
		
		String fieldValue = (String) privateField.get(s1);
		System.out.println("Name = " + fieldValue);
		//change name 
		privateField.set(s1, "B");
		System.out.println("Name after change = " + s1.getName());
		
		//		AccessPrivateMethodExample
		System.out.println("old age: "+ s1.getAge());
			Method privateMethod = classStudent.getDeclaredMethod("setAge", int.class);
					privateMethod.setAccessible(true);
					privateMethod.invoke(s1, 30);
					
				System.out.println("New Age = "+ s1.getAge());
				
		}
		
}
