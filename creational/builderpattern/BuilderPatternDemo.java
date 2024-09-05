package creational.builderpattern;

import java.util.logging.Logger;

public class BuilderPatternDemo {


    public static void main(String[] args) {
        Logger logger = Logger.getLogger("BuilderPatternDemo");
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        logger.info("Veg Meal");

        vegMeal.showItems();
        logger.info("Total Cost: "+ vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        logger.info("\n\nNon Veg Meal");

        nonVegMeal.showItems();
        logger.info("Total Cost: "+ nonVegMeal.getCost());
    }

}
