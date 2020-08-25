import java.util.*;
import java.lang.*;
import java.io.*;

class chefrun
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
	Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int b=0;b<t;b++) {
			
		double X1 = scan.nextInt();
		double X2 = scan.nextInt();
		double X3 = scan.nextInt();
		double V1 = scan.nextInt();
		double V2 = scan.nextInt();
		
		if((X3-X1)/V1 > (X2-X3)/V2) {
			System.out.println("Kefa");
			
		}else if ((X3-X1)/V1 < Math.abs(X2-X3)/V2) {
			System.out.println("Chef");
		}else  {
			System.out.println("Draw");
		}

		}
	}
}
