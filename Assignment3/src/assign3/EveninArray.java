package assign3;

import java.util.Scanner;

public class EveninArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n;
	      Scanner s =new Scanner(System.in);
	       System.out.println("Enter how many numbers in array:");
	       n=s.nextInt();
	       int a[] = new int[n];
	       System.out.println("Enter numbers in array:");
	       for(int i=0;i<n;i++){
	    	   a[i]= s.nextInt();
	       }
	       System.out.println("Even numbers in array:");
	       for(int i = 0 ; i < n ; i++)
	       {
	           if(a[i] % 2 == 0)
	           {
	               System.out.print(a[i]+" ");
	           }
	       }
	}

}
