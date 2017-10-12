package assign3;

import java.util.Scanner;

public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number for fibo series:");
        n =input.nextInt();
        fibo(n);
	}

  public static void fibo(int n){
	  if (n == 0)
		  System.out.println("0");
	  else if (n==1)
		  System.out.println("0 1");
	    int a=0,b=1;
	    for(int i=1;i<=n;i++){
	    	int nextnumber=a+b;
	    	System.out.println(nextnumber+"");
	    	a=b;
	    	b=nextnumber;
	    }
}
}