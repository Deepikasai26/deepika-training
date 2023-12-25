package demo;
import java.util.Scanner;
public class Displaycontent {
  public static void main(String[]args) {
	  int n;
	  Scanner SC = new Scanner(System.in);
	  n = SC.nextInt();
	  int fact_var = 1;
	  for(int i=1;i<=n;i++)
	  {
		  fact_var = fact_var*i;
	  }
	  System.out.println("Factorial of the number "+n+" is :"+fact_var);
  }
}
