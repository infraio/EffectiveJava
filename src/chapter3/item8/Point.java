package chapter3.item8;

public class Point {
  private final int x;
  private final int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  /**
   * 1. Reflexivity. x.euqals(x) must return true.
   * 2. Symmetry. if x.euqals(y) return true, y.equals(x) return true.
   * 3. Transitivity. if x.euqals(y) return true, y.equals(z) return true,
   *    then x.equals(z) return true.
   * 4. Consistent. Multiple invocations of x.equals(y) consistently return true
   *    or consistently return false.
   * 5. For any non-null reference value x, x.equals(null) must return false.      
   */
  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Point)) {
      return false;
    }
    Point p = (Point) o;
    return x == p.x && y == p.y;
  }
}
