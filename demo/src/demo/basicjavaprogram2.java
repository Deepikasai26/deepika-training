package demo;
import java.util.Scanner;
public class basicjavaprogram2{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		Scanner SC = new Scanner(System.in);{
		System.out.println("Enter first number: ");
		num1 = SC.nextInt();
		System.out.println("Enter second number: ");
		num2 = SC.nextInt();
		System.out.println("Arithematic operations on the two numbers are :");
		System.out.println("addition of the nummber is :"+(num1+num2));
		System.out.println("subtraction of the nummber is :"+(num1-num2));
		System.out.println("multiplicaton of the nummber is :"+(num1*num2));
		System.out.println("division of the nummber is :"+(num1/num2));
		System.out.println("module of the nummber is :"+(num1%num2));
		}
		
	}
}
