import java.util.Scanner;

class Calculator {

  public static double divide(double a, double b) {
    if (b == 0) {
      System.out.println("Cannot divide by zero!");
      return 0;
    }
    return a / b;
  }
}