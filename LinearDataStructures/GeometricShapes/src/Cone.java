public class Cone extends GeometricShapes {
    public Cone(double radius, double height) {
        super(radius, height);
    }

    public double calculateSurfaceArea() {
        return Math.PI * radius * (radius + height);
    }

    public double calculateVolume() {
        return 1.0 / 3.0 * Math.PI * Math.pow(radius, 2) * height;
    }
}
