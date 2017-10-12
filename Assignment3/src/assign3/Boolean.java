package assign3;

public class Boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      boolean a,b,c;
      a = true;
      b =true;
      c = false;
      
      if ( a && b)
    	  System.out.println("a and b are True");
      else if (b && c)
    	  System.out.println("b and c are True");
      else if (c &&a)
    	  System.out.println("c and a are True");
      else
    	  System.out.println("No two Booleans are true ");
	}

}
