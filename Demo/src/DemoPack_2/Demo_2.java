package DemoPack_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo_2 {

	public static void main(String[] args) {
		  Scanner input  = new Scanner(System.in);
		  
		  double r, circum, area;
		  
		  System.out.println("Enter the redius: ");
		  r = input.nextDouble();
		  
		  if(r < 0) {
			  System.out.println("The raduis must be positive!!");
			  return;
		  }
		  
		  circum = 2 * Math.PI * r;
		  area = Math.PI * Math.pow(r, 2);
		  
		  System.out.println("For the Circle that redius is : "+r);
		  System.out.println("The Circum is : "+circum);
		  System.out.println("The Area is : "+area);
		  
		  
		  input.close();
	}
	
}
