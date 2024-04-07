package geometry;

public class Main {
    public static void main(String[] args) {
        // Tworzenie tablicy obiektów typu Circle i ColoredCircle
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(new Point(1.0, 1.0), 3.0);
        circles[1] = new ColoredCircle(new Point(2.0, 2.0), 4.0, "red");
        circles[2] = new ColoredCircle(new Point(3.0, 3.0), 5.0, "green");

        // Iteracja tablicy i wywołanie metody calculateArea()
        for (Circle circle : circles) {
            double area = circle.calculateArea();
            System.out.println("Pole koła: " + area);

            // Jeżeli element tablicy jest instancją ColoredCircle, wywołaj metodę getColor()
            if (circle instanceof ColoredCircle) {
                String color = ((ColoredCircle) circle).getColor();
                System.out.println("Kolor koła: " + color);
            }
        }
    }
}