package assign3;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n;
         Scanner input= new Scanner(System.in);
         System.out.println("Enter the Number:");
         n=input.nextInt();
         int result=1;
         for(int i=1;i<=n;i++){
        	 result=result*i;
	}
    System.out.println("Factorial of given number is " + result);
}
}