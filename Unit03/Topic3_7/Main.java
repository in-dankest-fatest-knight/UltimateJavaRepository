package Unit03.Topic3_7;

public class Main {

  public static boolean almostEquals(double n1, double n2, double tolerance) {
    return Math.abs(n1 - n2) < tolerance;
  }

  public static void main(String[] args) {
    double num1 = 1.0;

    double num2 = 0.0;

    for (int i = 1; i<=10; i++) {
      num2 += 0.1;
    }

    System.out.println("num1: " + num1 + ", num2: " + num2);
    System.out.println(num1 == num2);
    System.out.println(almostEquals(num1, num2, 1e-9));

  }

}

// javac Unit03/Topic3_7/Main.java; java Unit03.Topic3_7.Main