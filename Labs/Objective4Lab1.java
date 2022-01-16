import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String fname = "";
    String lname = "";
    String favoriteAnimal = "";
    String favoriteFood = "";
    String favoriteSong = "";

    System.out.println("What is your first name?");
    fname= scanner.nextLine();

    System.out.println("What is your last name?");
    lname= scanner.nextLine();

    System.out.println("What is your favrotie animal?");
    favoriteAnimal= scanner.nextLine();

    System.out.println("What is your favorite food?");
    favoriteFood= scanner.nextLine();

    System.out.println("What is your favroite song?");
    favoriteSong= scanner.nextLine();


    scanner.close();


    System.out.println("My name is " + fname + " " + lname);

    System.out.println("My favorite animal is " + favoriteAnimal);

    System.out.println("My favorite food is " + favoriteFood);

    System.out.println("My favorite song is " + favoriteSong);



    //TODO prompt the user to get input for all of the String variables.

    //TODO print the output formatted to look like the expected output using String concatenation.

  }
}
