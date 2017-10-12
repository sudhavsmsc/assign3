package assign3;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input=new Scanner(System.in);
       System.out.println("Enter the base of triangle:");
       double base= input.nextDouble();
       System.out.println("Enter the height of triangle:");
       double height= input.nextDouble();
       double areat=base * height;
       System.out.println(" Area of triangle:" + areat);
       System.out.println("Enter the length of rectangle:");
       double length= input.nextDouble();
       System.out.println("Enter the width of rectangle:");
       double width= input.nextDouble();
       double arear=length * width;
       System.out.println(" Area of rectangle:" + arear);
       System.out.println("Enter the side of square:");
       double side= input.nextDouble();
        double areas=side*side;
       System.out.println(" The area of square:" + areas);
	}

}
