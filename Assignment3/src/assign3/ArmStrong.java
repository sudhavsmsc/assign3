package assign3;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input=new Scanner(System.in); 
    System.out.println("Enter a number:");
   int  n=input.nextInt();
    int r,sum=0,temp =n;
    while(n>0)
    {
    	r=n%10;
    	n=n/10;
    	sum=sum+(r*r*r);
    }
     if (sum==temp)
     System.out.println("Given Number is Armstrong number");
     else
    System.out.println("Given Number is not Armstrong number");
	}

}
