package secondlab.tasksecond;

class Pyramid extends Shape {

    private final double side;
    private final double height;
    private final double averageHeightSide;

    public Pyramid(double side, double height, double averageHeightSide) {
        this.side = side;
        this.height = height;
        this.averageHeightSide = averageHeightSide;
    }

    @Override
    public double getArea() {
        double baseArea = side * side;
        double lateralArea = 4 * (0.5 * side * averageHeightSide);
        return baseArea + lateralArea;
    }

    @Override
    public double getVolume() {
        return (1.0 / 3.0) * Math.pow(side, 2) * height;
    }
}