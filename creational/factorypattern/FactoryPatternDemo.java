package creational.factorypattern;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // get an object of circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        // call draw method of circle.
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        // call draw method of circle.
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");

        // call draw method of circle.
        shape3.draw();
    }
}

