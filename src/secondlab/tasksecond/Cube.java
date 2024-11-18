package secondlab.tasksecond;

class Cube extends Shape {
    private final double sideLength;

    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return 6 * sideLength * sideLength;
    }

    @Override
    public double getVolume() {
        return Math.pow(sideLength, 3);
    }
}
