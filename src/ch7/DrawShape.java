package ch7;

class Shape {
  String color = "green";
  void draw() {
    System.out.println("color :" + color);
  }
}

class Point {
  int x;
  int y;

  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
  Point() {
    this(0,0);
  }
  String getXY() {
    return "[x : " + x + ", y : " + y + "]";
  }
}

class Circle extends Shape {
  Point center;
  int r;

  Circle() {
    this(new Point(0,0), 50);
  }
  Circle(Point center, int r) {
    this.center = center;
    this.r = r;
  }
  void draw() {
    System.out.println("circle center : " + center.x + "," + center.y);
    System.out.println("circle color : " + color);
    System.out.println("circle r :" + r);
  }
}

class Triangle extends Shape {
  Point[] p = new Point[3];

  Triangle(Point[] p) {
    this.p = p;
  }
  void draw() {
    System.out.println("Triangle p1 :" + p[0].x + "," + p[0].y);
    System.out.println("Triangle p1 :" + p[1].x + "," + p[1].y);
    System.out.println("Triangle p1 :" + p[2].x + "," + p[2].y);
  }
}

public class DrawShape {

  public static void main(String[] args) {
    Circle c = new Circle(new Point(50, 50), 50);
    c.draw();

    Point[] p = {
        new Point(10,10),
        new Point(20,20),
        new Point(30,30)
    };
    Triangle t = new Triangle(p);
    t.draw();

  }

}