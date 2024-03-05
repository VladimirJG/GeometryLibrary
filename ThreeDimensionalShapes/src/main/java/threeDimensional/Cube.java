package threeDimensional;

public class Cube {
    private final double sideLength;

    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public double calculateSurfaceArea() {
        return 6 * Math.pow(sideLength, 2);
    }

    public double calculateVolume() {
        return Math.pow(sideLength, 3);
    }
}