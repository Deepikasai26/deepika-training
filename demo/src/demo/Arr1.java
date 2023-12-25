package demo;

public class Arr1 {
// Single Dimensional Array - 1
	public static void main(String[] args) {
		int x[] = {10,20,30,40,50};
		System.out.println("First value is : " + x[0]);
		System.out.println("Second value is : " + x[1]);

		System.out.println("No of Values : " + x.length);
		
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i] + "\t");
		}
		
	}

}
