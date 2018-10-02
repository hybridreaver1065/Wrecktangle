import java.util.Scanner;
//@author Jacob Mingis de Period Seven
public class rektangle {
	Scanner in = new Scanner(System.in);
	///length of the sides
	
	//Area, perimeter, and diagnol length each on their own line
	System.out.print("Please enter a side length:")
	double width= in.nextDouble();
	in.nextLine();
	System.out.print("Please enter another side length:")
	double length = in.nextDouble();
	in.nextLine();
	
	System.out.print("%.2f", width*length);
	System.out.print("%.2f", Math.sqrt(Math.pow(length, 2)+ Math.pow(width, 2));
	System.out.print("%.2f", width *2 +length *2);

}
