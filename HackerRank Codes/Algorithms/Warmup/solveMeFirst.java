import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class solveMeFirst {
  int a,b;
  static int solveMeFirst(int a,int b) {
      a = a;
      b = b;
      return a+b;
  }
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = solveMeFirst(a, b);             
        System.out.println(sum);
  }
}



