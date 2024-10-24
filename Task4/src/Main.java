

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(5.0);
        Shape square = new Square(5.0);

        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Square area: " + square.getArea());

        ShapeBuilder shapeBuilder = new ShapeBuilder();
        shapeBuilder.addShape(circle);
        shapeBuilder.addShape(square);
        System.out.println("Total area of all shapes: " + shapeBuilder.getTotalArea());

    }
}