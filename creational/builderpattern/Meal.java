package creational.builderpattern;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Meal {

    Logger logger = Logger.getLogger(getClass().getName());

    private final List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;

        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            logger.info("Item: " + item.name());
            logger.info(", Packing : " + item.packing());
            logger.info("Price: " + item.price());
        }
    }
}
