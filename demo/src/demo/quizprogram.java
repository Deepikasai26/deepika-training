package demo;
import java.util.Scanner;
public class quizprogram {
   public static void main(String[]args) {
	   while(true) {
	   Scanner sc = new Scanner(System.in);
			   System.out.println("who is the founder of blueorigin ?");
	           System.out.println("1.Bill gates\n2.Timcook\n3.Nadela\n4.jeffbezos\n5.break");
	           System.out.println("Enter ur choice:");
	           int n = sc.nextInt();
	           if(n==4) {
	        	   System.out.println("Congratulations! you have guessed the correct answer");
	           }
	           else if (n==5) {
	        	   break;
	           }
	           else {
	        	   System.out.println("wrong choice please try again");
	           }
	   }
   }
}
