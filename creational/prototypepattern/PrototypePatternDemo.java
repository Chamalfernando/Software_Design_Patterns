package creational.prototypepattern;

import java.util.logging.Logger;

public class PrototypePatternDemo {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger("creational.prototypepattern");

        ShapeCache.loadCache();

        Shape clonedShape1 = ShapeCache.getShape("1");
        logger.info("Shape : " + clonedShape1.getType());

        Shape clonedShape2 =  ShapeCache.getShape("2");
        logger.info("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape("3");
        logger.info("Shape : " + clonedShape3.getType());
    }
}
