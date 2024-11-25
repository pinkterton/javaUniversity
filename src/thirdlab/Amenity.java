package thirdlab;

import java.util.Objects;

public class Amenity {
    private final String name;
    private final double cost;
    private final int additionalCapacity;

    public Amenity(String name, double cost, int additionalCapacity) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (cost < 0) {
            throw new IllegalArgumentException("Cost cannot be negative");
        }
        if (additionalCapacity < 0) {
            throw new IllegalArgumentException("Additional capacity cannot be negative");
        }

        this.name = name;
        this.cost = cost;
        this.additionalCapacity = additionalCapacity;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public int getAdditionalCapacity() {
        return additionalCapacity;
    }

}
