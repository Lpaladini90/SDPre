public class Objective3Lab2 {
  public static void main(String[] args) {
    double side1, side2, hypotenuse;

    // value for side 1
    side1 = 10;

    // value for side 2
    side2 = 8;

    // equation for A^2 + B^2 = C^2
    double total = ((side1 * side1) + (side2 * side2));


    hypotenuse = Math.sqrt(total);

    System.out.println("The hypotenuse of a triangle with sides " + side1 + " and " + side2 + " is " + hypotenuse);
 }
}
