package array;
import java.util.Scanner;
public class array2 {
// Double Dimensional Array - 1
		public static void main(String[] args) {		
			int x[][] = new int[3][3];
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter 9 values...");
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					x[i][j] = sc.nextInt();
				}
			}
			System.out.println("Array Values : ");
			int sum = 0;
			for(int i=0;i<3;i++) // rows
			{
				for(int j=0;j<3;j++) // cols
				{
					System.out.print(x[i][j] + "  ");
					if(i==j)
						sum = sum+x[i][j];
				}
				System.out.println();
			}
			System.out.println("Sum of Diagonal Elements : " + sum);
		}
	}

