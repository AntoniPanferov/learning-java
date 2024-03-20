public abstract class GeometricShapes {
  public double radius;
  public double height;
  public GeometricShapes(double radius, double height) {
    this.radius = radius;
    this.height = height;
  }

  public abstract double calculateVolume();
  public abstract double calculateSurfaceArea();
}