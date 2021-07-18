import java.util.Random;
import java.util.Scanner;

public class AgeGuess {

	public static void main(String[] args) {
		int ageGuess;
		String name;
		int age;
		
		Scanner scan = new Scanner(System.in); // a new Scanner object sc is declared
		
		age = new Random().nextInt(100); // random age range (0-100)
		
		
		System.out.print("Please enter the name:");
		name=scan.nextLine(); // Accept the name
		
		System.out.print("Please enter age guess:");
		ageGuess=scan.nextInt(); // Accept the age
		
		System.out.println("Name is" +name); // Displays the name
		System.out.println("Age is" +ageGuess); // Displays the age guess
		
		System.out.println("Actual user age is: "+ age);
		System.out.println("Guessed user age is: "+ ageGuess);
		
		
	}

}
