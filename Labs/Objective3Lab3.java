public class Objective3Lab3 {
  public static void main(String[] args) {

    //variables
    int die1;
    int die2;
    int die3;


     die1= 1 + (int)(Math.random() * 6);
     die2= 1 + (int)(Math.random() * 6);
     die3= 1 + (int)(Math.random() * 6);

     int sum= die1 + die2 + die3;

    System.out.println(die1+ " + "+ die2+ " + "+ die3+ " = " + sum);

  }
}
