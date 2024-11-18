package secondlab.taskthird;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private final List<Bin> bins;

    public Warehouse() {
        bins = new ArrayList<>();
    }

    public void addItemToBin(Item item, Bin bin) {
        bin.addItem(item);

        if (!bins.contains(bin)) {
            bins.add(bin);
        }
    }

    public void displayItems() {
        if (bins.isEmpty()) {
            System.out.println("No items in the warehouse.");
            return;
        }
        System.out.println("Items in the warehouse:");
        for (Bin bin : bins) {
            for (Item item : bin.getItems()) {
                if (item != null) {
                    System.out.println("Item Name: " + item.getName() + ", Width: " + item.getWidth() +
                            ", Height: " + item.getHeight() + ", Length: " + item.getLength());
                }
            }
        }
    }
}
