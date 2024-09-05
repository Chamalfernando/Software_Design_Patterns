package creational.prototypepattern;

import java.util.logging.Logger;

public class Square extends Shape {

    Logger logger = Logger.getLogger(getClass().getName());

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        logger.info("Inside Square::draw() method.");
//        System.out.println("Inside Square::draw() method.");
    }
}