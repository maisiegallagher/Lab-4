import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		
		String input;
		int num;

		do {
			System.out.println("Please enter an integer:");

			num = scnr.nextInt();

			System.out.printf("Number");

			System.out.printf("%10s", "Squared");

			System.out.printf("%10s %n", "Cubed");

			System.out.printf("======");

			System.out.printf("%10s", "=======");

			System.out.printf("%10s %n", "=====");

			for (int i = 1; i <= num; i++) {
				System.out.printf("%-9d", i);
				System.out.printf("%-12d", i * i);
				System.out.printf("%-8d %n", i * i * i);}

			System.out.println();
			System.out.println("Continue? (y/n)");

			input = scnr.next();
			
		} while (input.equalsIgnoreCase("y")); 

		System.out.println("Goodbye!");
		scnr.close();
	}
		
}
