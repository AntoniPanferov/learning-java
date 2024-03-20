public class Sphere extends GeometricShapes {
    public Sphere(double radius, double height) {
        super(radius, height);
    }
    public double calculateSurfaceArea() {
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }

    public double calculateVolume() {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
}
