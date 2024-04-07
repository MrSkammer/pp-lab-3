package geometry;

public class Main {
    public static void main(String[] args) {

        Point point = new Point(3.5, 2.0);

        Circle circle = new Circle(point, 5.0);

        ColoredCircle coloredCircle = new ColoredCircle(point, 5.0, "blue");

        System.out.println("Properties of the circle:");
        System.out.println("Middle of the circle: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Radius of the circle: " + circle.getRadius());
        System.out.println("Circumference of a circle: " + circle.calculatePerimeter());
        System.out.println("Area of the circle: " + circle.getArea());
        System.out.println("Color of the circle: " + coloredCircle.getColor());
    }    
}

