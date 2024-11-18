package secondlab.taskthird;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        Item item1 = new Item("Playstation 5", 50, 30, 10);
        Item item2 = new Item("Pc set", 60, 70, 80);
        Item item3 = new Item("Car detail", 15, 10, 1);
        Item item4 = new Item("LEGO", 60, 80, 90);
        Item item5 = new Item("TV", 61, 60, 65);
        Item item6 = new Item("Blender", 20, 15, 15);
        Item item7 = new Item("Сooking pot", 15, 10, 5);

        Bin bin1 = new Bin(60, 80, 90);

        warehouse.addItemToBin(item1, bin1);
        warehouse.addItemToBin(item2, bin1);
        warehouse.addItemToBin(item3, bin1);
        warehouse.addItemToBin(item4, bin1);
        warehouse.addItemToBin(item5, bin1);
        warehouse.addItemToBin(item6, bin1);
        warehouse.addItemToBin(item7, bin1);

        warehouse.displayItems();
    }
}