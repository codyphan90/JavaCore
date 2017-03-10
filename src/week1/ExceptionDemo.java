package week1;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Formatter;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) throws IOException {
		
		
//		//Checked Exception: is checked at compile time
//		//Ex: SQLException, IOException , DataAccessException, ClassNotFoundException, InvocationTargetException
//		
		FileInputStream fis = null;
//		
//		
//	        fis = new FileInputStream("C:/myfile.txt"); 
//		int k; 
//
//		
//		while(( k = fis.read() ) != -1) 
//		{ 
//			System.out.print((char)k); 
//		} 
//
//		
//		fis.close(); 	
		
		
		
//		Uncheck Exception: is run at runtime (bad data input from user)
//		Ex:  NullPointerException,  ArrayIndexOutOfBoundsException,  ArithmeticException, IllegalArgumentException
		System.out.println("Input num1:");
		Scanner sc = new Scanner(System.in);
		float num1 = sc.nextInt();
		System.out.println("Input num2:");
		float num2 = sc.nextInt();
		float res=num1/num2;
		NumberFormat fm = new DecimalFormat("#0.00");
		System.out.println("num1/num2 = "+ fm.format(res));

	}

}
