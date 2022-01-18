public class Objective5Lab1 {
  public static void main(String[] args) {
    int num1 = 5;
    int num2 = 15;
    boolean bool1, bool2, bool3, bool4, bool5, bool6;

    bool1 = (num1 < num2);
    bool2 = (num1 > num2);
    bool3 = (num1 <= num2);
    bool4 = (num1 >= num2);
    bool5 = (num1 == num2);
    bool6 = (num1 != num2);

    if(num1 > num2) {
      System.out.println(num1 + " is greater than " + num2);
    }
    else if(num2 > num1) {
      System.out.println(num2 + " is greather than " + num1);
    }
  }
}
