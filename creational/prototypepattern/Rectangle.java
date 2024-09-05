package creational.prototypepattern;

import java.util.logging.Logger;

public class Rectangle extends Shape {

    Logger logger = Logger.getLogger(getClass().getName());

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        logger.info("Inside Rectangle::draw() method.");
//        System.out.println("Inside Rectangle::draw() method.");
    }
}