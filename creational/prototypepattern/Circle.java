package creational.prototypepattern;

import java.util.logging.Logger;

public class Circle extends Shape {

    Logger logger = Logger.getLogger(getClass().getName());

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
//        System.out.println("Inside Circle::draw() method.");
        logger.info("Inside Circle::draw() method.");
    }
}
