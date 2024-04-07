package geometry;

public class Main {
    public static void main(String[] args) {

        //Circle[] circles = new Circle[3];
        //circles[0] = new Circle(new Point(1.0, 1.0), 3.0);
        //circles[1] = new ColoredCircle(new Point(2.0, 2.0), 4.0, "red");
        //circles[2] = new ColoredCircle(new Point(3.0, 3.0), 5.0, "green");

        Rectangle rectangle = new Rectangle(5.0, 3.0);
        Square square = new Square(4.0);

        //for (Circle circle : circles) {
            //double area = circle.calculateArea();
            //System.out.println("Area of the circle: " + area);

           // if (circle instanceof ColoredCircle) {
           //     String color = ((ColoredCircle) circle).getColor();
           //     System.out.println("Color of the circle: " + color);
           // }
       // }


        System.out.println("Properties of the Rectangle:");
        System.out.println("Lenght: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Area of the Rectangle: " + rectangle.calculateArea());
        System.out.println("Circumference of the Rectangle: " + rectangle.calculatePerimeter());

        System.out.println("");

        System.out.println("Properties of the Square:");
        System.out.println("Lenght: " + square.getLength());
        System.out.println("Width: " + square.getWidth());
        System.out.println("Area of the Rectangle: " + square.calculateArea());
        System.out.println("Circumference of the Rectangle: " + square.calculatePerimeter());
    }
}