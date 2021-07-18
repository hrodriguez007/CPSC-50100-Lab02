import java.util.Random;
import java.util.Scanner;

public class UserNames {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter user first name");
		String firstName = scan.nextLine();
		
		System.out.print("Enter user last name");
		String lastName = scan.nextLine();
		
		Random num = new Random();
		
	
		
		String randomName = lastName.substring(0,4) + firstName.charAt(0) + (num.nextInt(99)+10); //generate random name by adding first 4 char from user last name and first char from user first name and random number range 10-99 
		System.out.println(randomName);
	}

}
