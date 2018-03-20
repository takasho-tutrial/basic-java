import java.util.*;
import java.lang.*;
import java.io.*;

class Ex1 {
  public static void main(String[] args) {
    question1();
    question2();
    question3();
    question4();
    question5();
    question6();
  }

  public static void question1 () {}

  public static void question2 () {
    int x = 10;
    int y = 20;
    float f1 = 10;
    float f2 = 20;

    int add = x + y;
    int sub = x - y;
    int multi = x * y;
    int div = x / y;
    float divFloat = f1 / f2;

    String output = String.format(
      "Add: %s, Sub: %s, Multi: %s, Div: %s, DivFloat: %s",
      add, sub, multi, div, divFloat
    );

    System.out.println(output);
  }

  public static void question3 () {
    String s = "Takasho";
    System.out.println(String.format("Nickname : %s", s));

    String s1 = "Life";
    String s2 = "is";
    String s3 = "Tech";
    String s4 = "!";
    System.out.println(s1 + s2 + s3 + s4);

    System.out.println(1000 + "hello" + true);
  }

  public static void question4 () {
    int a = 10;
    int b = 20;
    int c = 10;

    boolean ab = a == b;
    boolean ac = a == c;

    String output = String.format(
      "a is b? : %s, a is c? : %s",
      ab, ac
    );

    System.out.println(output);

    if (ab) {
      System.out.println("a is b!");
    } else if (ac) {
      System.out.println("a is c!");
    } else {
      System.out.println("No same value!");
    }
  }

  public static void question5 () {
    int weather = 0;

    for (int i = 0; i < 4; i++) {
      switch (i) {
        case 0:
          System.out.println("Sunny");
          break;
        case 1:
          System.out.println("Rain");
          break;
        case 2:
          System.out.println("Cloudy");
          break;
        case 3:
          System.out.println("Other");
          break;
      }
    }
  }

  public static void question6 () {
    int i = 10;
    int j = 20;
    question6_asset(i, j);

    i = 30;
    j = 15;
    question6_asset(i, j);
  }

  public static void question6_asset (int i, int j) {
    if (i >= 5 && i < 15) {
      System.out.println("iは5以上15未満");
    }
    if (j % 2 == 0) {
      System.out.println("jは偶数");
    }
  }
}
