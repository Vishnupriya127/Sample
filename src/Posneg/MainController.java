package Posneg;

import java.util.Scanner;

public class MainController extends Posneg{
public static void main(String args[]){
	//MainController obj=new MainController();
	/*int a,b;
	boolean negative;*/
	MainController obj=new MainController();
	@SuppressWarnings("resource")
	Scanner ss=new Scanner(System.in);
	System.out.println("Enter the value for a(Integer): ");
	int a = ss.nextInt();
	System.out.println("Enter the value for b(Integer): ");
	int b = ss.nextInt();
	System.out.println("Enter the value for Negative(true or false): ");
	boolean negative = ss.nextBoolean();
	Boolean Result=obj.posNeg(a, b, negative);
	System.out.println("The returned value is :"+Result);
	
}
}
