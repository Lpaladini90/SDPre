import java.util.Scanner;

public class Objective9Lab5 {

  public static void main(String[] args) {
    Scanner kb = new Scanner (System.in);
		double num1, num2;
		boolean keepGoing = true;
		int choice;
		double answer = 0.0;

      System.out.print("Please give me a number:");
       num1= kb.nextInt();

    // Part 1:
    // prompt the user to provide one number and store their input in num1
    /*
    * Solution for Part 1 goes here
    */


      System.out.print("Please give me another number:" );
      num2= kb.nextInt();
    // Part 2:
    // Prompt the user for another number and store their input in num2
    /*
    * Solution for Part 2 goes here
    */

		while (keepGoing) {
			printMenu();
			System.out.print("Which would you like to do? ");
			choice = kb.nextInt();

			switch (choice) {
       case 1:

         double answer3 = findSum(num1, num2);
          System.out.println(num1 + " + " + num2 + " = " +  answer3 );
          break;


        case 2:
        double answer1 = findAverage(num1, num2);
          System.out.println("The average of " + num1 + " and " + num2 + " is: " +  answer1 );
          break;

        case 3:
         double answer2 = calcTax(num1, num2);
          System.out.println("The amount in tax to be collected from a purchase of $" + num1 + " and $" + num2 + " is: $" + answer2 );
          break;

        case 4:
          System.out.println("You've chosen to quit.");
          return;

        default:
          System.out.println("Invalid entry. Please try again");
          break;


}
      /*
      // Part 3:
      // Complete this switch, with each case calling one of the methods below,
      // then printing out the result (refer to "Expected Output" below)
			// Don't forget to account for a user accidentally inputting an invalid number!
      /*
      * Solution for Part 3 goes here
      */

    }
kb.close();
}


	public static void printMenu(){
		System.out.println();
		System.out.println("========= MENU =========");
		System.out.println("|                      |");
		System.out.println("|   1. Add Numbers     |");
		System.out.println("|   2. Find Average    |");
		System.out.println("|   3. Calculate Tax   |");
		System.out.println("|   4. Exit            |");
		System.out.println("|                      |");
		System.out.println("========================");
		System.out.println();

  }

	public static double findSum(double x, double y) {
		double sum = x + y;
		return sum;
	}
  public static double findAverage(double x, double y) {
    double sum = (x+y) / 2;
    return sum;

  }
  // Part 4:
  // Write a method named "findAverage" that takes two doubles as parameters,
  // and returns a double that represents the average of the two parameters.
  // Use the "findSum" method as an example.
  /*
  * Solution for Part 4 goes here
  */
public static double calcTax( double x, double y) {
  double sum = (x +y)*(.0831);
  return sum;
}
	// Part 5:
  // Write a method named "calcTax" that also takes two doubles as parameters,
  // and returns a double that represents the amount of tax the user would have
  // to pay based on the total of the two parameters. Use a tax rate of 8.31%
  // (Not a grand total, just the total taxes.  Refer to "Expected Output")
  /*
  * Solution for Part 5 goes here
  */


  }