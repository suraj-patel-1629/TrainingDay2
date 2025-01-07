import java.util.Scanner;

class Calculator {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Simple Calculator");
    System.out.println("Choose an operation: add, subtract, multiply, divide");
    String operation = scanner.nextLine().toLowerCase();

    System.out.println("Enter the first number: ");
    double num1 = scanner.nextDouble();

    System.out.println("Enter the second number: ");
    double num2 = scanner.nextDouble();

    switch (operation) {
      case "add":
        System.out.println("Result: " + add(num1, num2));
        break;
      case "subtract":
        System.out.println("Result: " + subtract(num1, num2));
        break;
      case "multiply":
        System.out.println("Result: " + multiply(num1, num2));
        break;
      case "divide":
        System.out.println("Result: " + divide(num1, num2));
        break;
      default:
        System.out.println("Invalid operation!");
    }

    scanner.close();
  }
}