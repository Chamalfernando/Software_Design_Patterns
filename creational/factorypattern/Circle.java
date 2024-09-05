package creational.factorypattern;

import java.util.logging.Logger;

public class Circle implements Shape {

    Logger logger = Logger.getLogger(getClass().getName());

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
        logger.info("Inside Circle::draw() method.");
    }
}
