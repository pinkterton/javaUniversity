package secondlab.taskthird;

public class Bin {
    private final int width;
    private final int height;
    private final int length;
    private final int MAX_CAPACITY = 5;
    private final Item[] items = new Item[MAX_CAPACITY];
    private int itemCount;

    public Bin(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public void addItem(Item item) {
        if (itemCount >= MAX_CAPACITY) {
            System.out.println("Bin is full. Cannot add more items.");
            return;
        }

        if (item.getWidth() > width || item.getHeight() > height || item.getLength() > length) {
            System.out.println("Item " + item.getName() + " does not fit in the bin.");
            return;
        }

        items[itemCount++] = item;
    }

    public Item[] getItems() {
        return items;
    }

    public int getItemCount() {
        return itemCount;
    }
}