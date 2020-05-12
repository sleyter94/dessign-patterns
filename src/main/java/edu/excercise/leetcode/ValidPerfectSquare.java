package edu.excercise.leetcode;

public class ValidPerfectSquare {

  public static void main(String[] args) {
    System.out.println(isPerfectSquare(681));
  }

  public static boolean isPerfectSquare(int num) {
    float root = squareRoot(num);
    int r = (int)root;
    return r*r == num;
  }

  static float squareRoot(float n)
  {

        /*We are using n itself as
        initial approximation This
        can definitely be improved */
    float x = n;
    float y = 1;

    // e decides the accuracy level
    double e = 0.01;
    while (x - y > e) {
      x = (x + y) / 2;
      y = n / x;
    }
    return x;
  }
}
