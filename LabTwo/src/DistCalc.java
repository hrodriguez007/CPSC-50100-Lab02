import java.util.Scanner;

public class DistCalc {

	public static void main(String[] args) {
		double x1, x2, y1, y2, distance;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter X value for point 1:"); 
		x1 = scan.nextInt();
		
		System.out.print("Enter Y value for point 1:");
		y1 = scan.nextInt();
		
		System.out.print("Enter X value for point 2:");
		x2 = scan.nextInt();
		
		System.out.print("Enter Y value for point 2:");
		y2 = scan.nextInt();
		
		distance = Math.sqrt(Math.pow(x2-x1, 2)+ Math.pow(y2-y1, 2)); //calculate distance
		System.out.printf("Distance:%.3f\n", distance); //print distance
		

	}

}
