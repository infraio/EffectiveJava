package chapter3.item8;

/**
 * Instead of having ColorPoint extend Point, give ColorPoint a private Point field
 * and a public view method that return the point at the same position as this color point. 
 */
public class ColorPoint {
  private final Point point;
  private final String color;
  
  public ColorPoint(Point point, String color) {
    this.point = point;
    this.color = color;
  }
  
  public Point asPoint() {
    return point;
  }
  
  @Override
  public boolean equals(Object o) {
    if (!(o instanceof ColorPoint)) {
      return false;
    }
    ColorPoint cp = (ColorPoint) o;
    return cp.point.equals(point) && cp.color.equals(color);
  }
}
